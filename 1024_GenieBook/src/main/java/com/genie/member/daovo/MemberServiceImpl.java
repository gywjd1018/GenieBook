package com.genie.member.daovo;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDAO;
	
	
	// 로그인 체크
	@Override
	public boolean loginCheck(MemberVO vo, HttpSession session) {

		boolean result = memberDAO.loginCheck(vo);
		
		if (result) {
			
			MemberVO vo2 = viewMember(vo);
			
			session.setAttribute("sid", vo2.getId());
			session.setAttribute("sname", vo2.getMemName());
			
		}
		
		return result;
		
	}
	@Override
	public List<MemberVO> viewAll(){
		return memberDAO.viewAll();
	}
	
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		memberDAO.delete(id);
		
	}
	
	
	// 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo) {

		return memberDAO.viewMember(vo);
		
	}

	// 로그아웃
	@Override
	public void logout(HttpSession session) {

		session.invalidate();
		
	}

	// 네이버 회원가입
	@Override
	public void naver_join(MemberVO vo) {

		memberDAO.naver_join(vo);
		
	}

	// SNS 로그인 시 등록된 회원 여부를 묻는 메소드
	@Override
	public boolean isMember(MemberVO vo) {
		
		if (memberDAO.isMember(vo))
			return true;
		
		return false;
		
	}
	
	// 회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		
		memberDAO.register(vo);
		
	}


	// 카카오 회원가입
	@Override
	public void kakao_join(MemberVO vo) {

		memberDAO.kakao_join(vo);
		
	}


}
