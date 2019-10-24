package com.genie.member.daovo;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	// myBatis ���� ��ü 
	@Inject
	SqlSession sqlSession;
	
	private static String namespace = "com.genie.mapper.MemberMapper";
	
	// �α��� üũ
	@Override
	public boolean loginCheck(MemberVO vo) {
		
		String name = sqlSession.selectOne("loginCheck", vo);
		
		return (name == null) ? false : true;
		
	}
	
	@Override
	public List<MemberVO> viewAll() {
		
		return sqlSession.selectList("viewAll");
		
} 
	
	@Override
	public void delete(String id) {
		
		// TODO Auto-generated method stub
		sqlSession.delete(id);
	}



	// �α��� ����
	@Override
	public MemberVO viewMember(MemberVO vo) {

		return sqlSession.selectOne("viewMember", vo);
		
	}

	// �α׾ƿ�
	@Override
	public void logout(HttpSession session) {
		
	}

	// ���̹� ȸ������
	@Override
	public void naver_join(MemberVO vo) {

		sqlSession.insert("naver_join", vo);
		
	}

	// SNS �α��� �� ��ϵ� ȸ�� ���θ� ���� �޼ҵ�
	@Override
	public boolean isMember(MemberVO vo) {
		
		String ok = sqlSession.selectOne("isMember", vo);
		
		return (ok == null) ? false : true;
		
	}
	
	// ȸ������	
	@Override
	public void register(MemberVO vo) throws Exception  {
			
		sqlSession.insert(namespace + ".register", vo);

	}

	// īī�� ȸ������	
	@Override
	public void kakao_join(MemberVO vo) {

		sqlSession.insert("kakao_join", vo);
		
	}
}
