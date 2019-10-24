package com.genie.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.genie.login.KakaoAPI;
import com.genie.login.NaverLoginBO;
import com.genie.member.daovo.MemberService;
import com.genie.member.daovo.MemberVO;
import com.github.scribejava.core.model.OAuth2AccessToken;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	MemberService memberService;

	// NaverLoginBO
	private NaverLoginBO naverLoginBO;
	private String apiResult = null;

	@Autowired
	private KakaoAPI kakao;

	@Autowired
	private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
		this.naverLoginBO = naverLoginBO;
	}

	// Controller 에 오자마자 이 함수를 제일 먼저 실행한다. ( / 과 GET 방식이므로 )
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String kaja() {

		return "main";

	}

	// 로그인 화면으로 이동
	@RequestMapping(value = "login.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String kajaLogin(Model model, HttpSession session) {

		// 네이버 아이디로 인증 URL 을 생성하기 위하여 naverLoginBO 클래스의 getAuthorizationUrl 메소드 호출
		String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);

		System.out.println("네이버 : " + naverAuthUrl);

		model.addAttribute("url", naverAuthUrl);

		// 생성한 인증 URL 을 View 로 전달
		return "login";

	}

	// 카카오 로그인 화면으로 이동
	@RequestMapping(value = "kakaoLogin.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String kajaLogin(Model model, HttpSession session, @RequestParam("code") String code, MemberVO member) {

		String accessToken = kakao.getAccessToken(code);

		HashMap<String, Object> userInfo = kakao.getUserInfo(accessToken);

		System.out.println("loginController : " + userInfo);

		// 클라이언트의 이메일이 존재할 때 세션에 해당 이메일과 토큰 등록
		if (userInfo.get("email") != null) {
			
			String email = (String) userInfo.get("email");
			
			int index = email.indexOf("@");

			String id = (((String) userInfo.get("email")).substring(0, index));
			
			member.setId(id);
			member.setPw("0000"); // DB에서 Not null로 처리했기에 임의로 준 값
			member.setMemName((String) userInfo.get("nickname"));
			member.setEmail(email);
			member.setGender((String) userInfo.get("gender"));
			
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPw());
			System.out.println("이름 : " + member.getMemName());
			System.out.println("이메일 : " + member.getEmail());
			System.out.println("성별 : " + member.getGender());
			
			model.addAttribute("msg", "login success");

			// 등록되지 않은 회원이라면 DB에 정보 입력
			if (!memberService.isMember(member))
				memberService.kakao_join(member);
			
			session.setAttribute("sid", id);
			session.setAttribute("access_Token", accessToken);
			
		}

		return "main";

	}

	// 네이버 로그인 성공 시 callback 호출 메소드
	@RequestMapping(value = "/callback", method = { RequestMethod.GET, RequestMethod.POST })
	public String callback(Model model, @RequestParam String code, @RequestParam String state, HttpSession session,
			HttpServletRequest request, MemberVO member) throws IOException, ParseException {

		OAuth2AccessToken oauthToken;

		oauthToken = naverLoginBO.getAccessToken(session, code, state);

		// 로그인 사용자 정보를 읽어온다.
		apiResult = naverLoginBO.getUserProfile(oauthToken);

		model.addAttribute("result", apiResult);

		// DB와 세션에 넣기
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(naverLoginBO.getUserProfile(oauthToken).toString());
		JSONObject response = (JSONObject) jsonObject.get("response");

		System.out.println("이것은" + jsonObject.get("response"));
		System.out.println("아이디는" + (String) response.get("id"));

		int index = ((String) response.get("email")).indexOf("@");

		member.setId(((String) response.get("email")).substring(0, index));
		member.setPw("0000"); // DB에서 Not null로 처리했기에 임의로 준 값
		member.setMemName((String) response.get("name"));
		member.setEmail((String) response.get("email"));
		member.setGender((String) response.get("gender"));

		System.out.println("아이디 : " + member.getId());
		System.out.println("비밀번호 : " + member.getPw());
		System.out.println("이름 : " + member.getMemName());
		System.out.println("이메일 : " + member.getEmail());
		System.out.println("성별 : " + member.getGender());

		request.getSession(true).setAttribute("sid", member.getId());

		model.addAttribute("msg", "login success");

		// 등록되지 않은 회원이라면 DB에 정보 입력
		if (!memberService.isMember(member))
			memberService.naver_join(member);

		return "main";

	}
	// 회원 삭제처리
	@RequestMapping(value = "delete.do", method = RequestMethod.GET )
	public String delete(@RequestParam(value="id")String id,Model model1) {
		memberService.delete(id);
		model1.addAttribute("viewAll", memberService.viewAll()); /*Controller 호출*/
		
		return "management";
	}
	
	// 관리자 페이지
	@RequestMapping(value="management.do" , method = { RequestMethod.GET, RequestMethod.POST })
	public String test(Model model1) {
		
		model1.addAttribute("viewAll",memberService.viewAll());
		
		return "management";
	}

	// 로그인 처리
	@RequestMapping(value = "loginCheck.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginCheck(MemberVO vo, HttpServletRequest req1, Model model1, HttpSession session) {

		boolean result = memberService.loginCheck(vo, session);

		// 로그인 성공
		if (result == true) {

			model1.addAttribute("msg", "login success");
			
			String sid = memberService.viewMember(vo).getId();

			if (sid.equals("admin"))
				return "adminMain";

			return "main";

		}

		else {

			model1.addAttribute("msg", "login fail");

			return "login";

		}

	}

	// 로그아웃 처리
	@RequestMapping(value = "logout.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String logout(HttpServletRequest req1, Model model1, HttpSession session) {

		memberService.logout(session);

		model1.addAttribute("msg", "logout");

		return "login";

	}

	@RequestMapping(value = "board.do", method = RequestMethod.GET)
	public String kajaBoard() {

		return "boardform";

	}

	@RequestMapping(value = "kajachat.do", method = RequestMethod.GET)
	public String kajaChatmain() {

		return "chatmain";

	}

	@RequestMapping(value = "maderoom.do", method = RequestMethod.GET)
	public String kajaRoom() {

		return "kajaroom";

	}

	@RequestMapping(value = "roomkaja.do", method = RequestMethod.GET)
	public String bang() {

		return "chatroom";

	}

	// 회원가입 페이지로 이동
	@RequestMapping(value = "register.do", method = RequestMethod.GET)
	public String register() {

		return "register";

	}

	// 회원가입 get
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void getregister() throws Exception {
		logger.info("get register");
	}

	// 회원가입 post
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postregister(MemberVO vo) throws Exception {
		logger.info("post register");

		memberService.register(vo);

		return "redirect:/";
	}

}
