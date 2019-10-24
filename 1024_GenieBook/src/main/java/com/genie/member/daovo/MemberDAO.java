package com.genie.member.daovo;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface MemberDAO {
	
	// �α��� üũ
	public boolean loginCheck(MemberVO vo);
	
	// �α��� ����
	public MemberVO viewMember(MemberVO vo);
	
	// �α׾ƿ� üũ
	public void logout(HttpSession session);
	
	// ���̹��� ȸ������
	public void naver_join(MemberVO vo);

	// SNS �α��� �� ��ϵ� ȸ�� ���θ� ���� �޼ҵ�
	public boolean isMember(MemberVO vo);
	
	// ȸ������
	public void register(MemberVO vo) throws Exception;
	
	public List<MemberVO> viewAll();
	
	public void delete(String id);

	// īī���� ȸ������
	public void kakao_join(MemberVO vo);

}
