package com.genie.member.daovo;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface MemberService {

	// 로그인 체크
	public boolean loginCheck(MemberVO vo, HttpSession session);

	// 로그인 정보
	public MemberVO viewMember(MemberVO vo);
	
	// 로그아웃
	public void logout(HttpSession session);
	
	// 네이버로 회원가입
	public void naver_join(MemberVO vo);

	// SNS 로그인 시 등록된 회원 여부를 묻는 메소드
	public boolean isMember(MemberVO vo);
	
	// 회원가입
	public void register(MemberVO vo) throws Exception;

	// 카카오로 회원가입
	public void kakao_join(MemberVO member);
	
	// 관리자의 회원 목록 보기
	public List<MemberVO> viewAll();

	// 관리자의 회원 삭제
	public void delete(String id);
	
}
