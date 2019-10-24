package com.genie.member.daovo;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface MemberService {

	// �α��� üũ
	public boolean loginCheck(MemberVO vo, HttpSession session);

	// �α��� ����
	public MemberVO viewMember(MemberVO vo);
	
	// �α׾ƿ�
	public void logout(HttpSession session);
	
	// ���̹��� ȸ������
	public void naver_join(MemberVO vo);

	// SNS �α��� �� ��ϵ� ȸ�� ���θ� ���� �޼ҵ�
	public boolean isMember(MemberVO vo);
	
	// ȸ������
	public void register(MemberVO vo) throws Exception;

	// īī���� ȸ������
	public void kakao_join(MemberVO member);
	
	// �������� ȸ�� ��� ����
	public List<MemberVO> viewAll();

	// �������� ȸ�� ����
	public void delete(String id);
	
}
