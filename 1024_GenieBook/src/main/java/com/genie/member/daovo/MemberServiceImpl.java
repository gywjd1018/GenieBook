package com.genie.member.daovo;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDAO;
	
	
	// �α��� üũ
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
	
	
	// �α��� ����
	@Override
	public MemberVO viewMember(MemberVO vo) {

		return memberDAO.viewMember(vo);
		
	}

	// �α׾ƿ�
	@Override
	public void logout(HttpSession session) {

		session.invalidate();
		
	}

	// ���̹� ȸ������
	@Override
	public void naver_join(MemberVO vo) {

		memberDAO.naver_join(vo);
		
	}

	// SNS �α��� �� ��ϵ� ȸ�� ���θ� ���� �޼ҵ�
	@Override
	public boolean isMember(MemberVO vo) {
		
		if (memberDAO.isMember(vo))
			return true;
		
		return false;
		
	}
	
	// ȸ������
	@Override
	public void register(MemberVO vo) throws Exception {
		
		memberDAO.register(vo);
		
	}


	// īī�� ȸ������
	@Override
	public void kakao_join(MemberVO vo) {

		memberDAO.kakao_join(vo);
		
	}


}
