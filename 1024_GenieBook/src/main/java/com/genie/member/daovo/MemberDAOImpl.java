package com.genie.member.daovo;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	// myBatis 실행 객체 
	@Inject
	SqlSession sqlSession;
	
	private static String namespace = "com.genie.mapper.MemberMapper";
	
	// 로그인 체크
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



	// 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo) {

		return sqlSession.selectOne("viewMember", vo);
		
	}

	// 로그아웃
	@Override
	public void logout(HttpSession session) {
		
	}

	// 네이버 회원가입
	@Override
	public void naver_join(MemberVO vo) {

		sqlSession.insert("naver_join", vo);
		
	}

	// SNS 로그인 시 등록된 회원 여부를 묻는 메소드
	@Override
	public boolean isMember(MemberVO vo) {
		
		String ok = sqlSession.selectOne("isMember", vo);
		
		return (ok == null) ? false : true;
		
	}
	
	// 회원가입	
	@Override
	public void register(MemberVO vo) throws Exception  {
			
		sqlSession.insert(namespace + ".register", vo);

	}

	// 카카오 회원가입	
	@Override
	public void kakao_join(MemberVO vo) {

		sqlSession.insert("kakao_join", vo);
		
	}
}
