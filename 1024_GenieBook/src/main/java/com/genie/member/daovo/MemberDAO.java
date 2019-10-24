package com.genie.member.daovo;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface MemberDAO {
	
	// 로그인 체크
	public boolean loginCheck(MemberVO vo);
	
	// 로그인 정보
	public MemberVO viewMember(MemberVO vo);
	
	// 로그아웃 체크
	public void logout(HttpSession session);
	
	// 네이버로 회원가입
	public void naver_join(MemberVO vo);

	// SNS 로그인 시 등록된 회원 여부를 묻는 메소드
	public boolean isMember(MemberVO vo);
	
	// 회원가입
	public void register(MemberVO vo) throws Exception;
	
	public List<MemberVO> viewAll();
	
	public void delete(String id);

	// 카카오로 회원가입
	public void kakao_join(MemberVO vo);

}
