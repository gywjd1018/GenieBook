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

	// Controller �� ���ڸ��� �� �Լ��� ���� ���� �����Ѵ�. ( / �� GET ����̹Ƿ� )
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String kaja() {

		return "main";

	}

	// �α��� ȭ������ �̵�
	@RequestMapping(value = "login.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String kajaLogin(Model model, HttpSession session) {

		// ���̹� ���̵�� ���� URL �� �����ϱ� ���Ͽ� naverLoginBO Ŭ������ getAuthorizationUrl �޼ҵ� ȣ��
		String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);

		System.out.println("���̹� : " + naverAuthUrl);

		model.addAttribute("url", naverAuthUrl);

		// ������ ���� URL �� View �� ����
		return "login";

	}

	// īī�� �α��� ȭ������ �̵�
	@RequestMapping(value = "kakaoLogin.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String kajaLogin(Model model, HttpSession session, @RequestParam("code") String code, MemberVO member) {

		String accessToken = kakao.getAccessToken(code);

		HashMap<String, Object> userInfo = kakao.getUserInfo(accessToken);

		System.out.println("loginController : " + userInfo);

		// Ŭ���̾�Ʈ�� �̸����� ������ �� ���ǿ� �ش� �̸��ϰ� ��ū ���
		if (userInfo.get("email") != null) {
			
			String email = (String) userInfo.get("email");
			
			int index = email.indexOf("@");

			String id = (((String) userInfo.get("email")).substring(0, index));
			
			member.setId(id);
			member.setPw("0000"); // DB���� Not null�� ó���߱⿡ ���Ƿ� �� ��
			member.setMemName((String) userInfo.get("nickname"));
			member.setEmail(email);
			member.setGender((String) userInfo.get("gender"));
			
			System.out.println("���̵� : " + member.getId());
			System.out.println("��й�ȣ : " + member.getPw());
			System.out.println("�̸� : " + member.getMemName());
			System.out.println("�̸��� : " + member.getEmail());
			System.out.println("���� : " + member.getGender());
			
			model.addAttribute("msg", "login success");

			// ��ϵ��� ���� ȸ���̶�� DB�� ���� �Է�
			if (!memberService.isMember(member))
				memberService.kakao_join(member);
			
			session.setAttribute("sid", id);
			session.setAttribute("access_Token", accessToken);
			
		}

		return "main";

	}

	// ���̹� �α��� ���� �� callback ȣ�� �޼ҵ�
	@RequestMapping(value = "/callback", method = { RequestMethod.GET, RequestMethod.POST })
	public String callback(Model model, @RequestParam String code, @RequestParam String state, HttpSession session,
			HttpServletRequest request, MemberVO member) throws IOException, ParseException {

		OAuth2AccessToken oauthToken;

		oauthToken = naverLoginBO.getAccessToken(session, code, state);

		// �α��� ����� ������ �о�´�.
		apiResult = naverLoginBO.getUserProfile(oauthToken);

		model.addAttribute("result", apiResult);

		// DB�� ���ǿ� �ֱ�
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(naverLoginBO.getUserProfile(oauthToken).toString());
		JSONObject response = (JSONObject) jsonObject.get("response");

		System.out.println("�̰���" + jsonObject.get("response"));
		System.out.println("���̵��" + (String) response.get("id"));

		int index = ((String) response.get("email")).indexOf("@");

		member.setId(((String) response.get("email")).substring(0, index));
		member.setPw("0000"); // DB���� Not null�� ó���߱⿡ ���Ƿ� �� ��
		member.setMemName((String) response.get("name"));
		member.setEmail((String) response.get("email"));
		member.setGender((String) response.get("gender"));

		System.out.println("���̵� : " + member.getId());
		System.out.println("��й�ȣ : " + member.getPw());
		System.out.println("�̸� : " + member.getMemName());
		System.out.println("�̸��� : " + member.getEmail());
		System.out.println("���� : " + member.getGender());

		request.getSession(true).setAttribute("sid", member.getId());

		model.addAttribute("msg", "login success");

		// ��ϵ��� ���� ȸ���̶�� DB�� ���� �Է�
		if (!memberService.isMember(member))
			memberService.naver_join(member);

		return "main";

	}
	// ȸ�� ����ó��
	@RequestMapping(value = "delete.do", method = RequestMethod.GET )
	public String delete(@RequestParam(value="id")String id,Model model1) {
		memberService.delete(id);
		model1.addAttribute("viewAll", memberService.viewAll()); /*Controller ȣ��*/
		
		return "management";
	}
	
	// ������ ������
	@RequestMapping(value="management.do" , method = { RequestMethod.GET, RequestMethod.POST })
	public String test(Model model1) {
		
		model1.addAttribute("viewAll",memberService.viewAll());
		
		return "management";
	}

	// �α��� ó��
	@RequestMapping(value = "loginCheck.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginCheck(MemberVO vo, HttpServletRequest req1, Model model1, HttpSession session) {

		boolean result = memberService.loginCheck(vo, session);

		// �α��� ����
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

	// �α׾ƿ� ó��
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

	// ȸ������ �������� �̵�
	@RequestMapping(value = "register.do", method = RequestMethod.GET)
	public String register() {

		return "register";

	}

	// ȸ������ get
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void getregister() throws Exception {
		logger.info("get register");
	}

	// ȸ������ post
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postregister(MemberVO vo) throws Exception {
		logger.info("post register");

		memberService.register(vo);

		return "redirect:/";
	}

}
