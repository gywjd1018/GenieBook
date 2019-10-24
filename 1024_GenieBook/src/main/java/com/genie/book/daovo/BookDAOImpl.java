package com.genie.book.daovo;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {
	
	// myBatis 실행 객체 
	@Inject
	SqlSession sqlSession;
	
	// 책 목록 보기
	@Override
	public List<BookVO> bookList() {
		
		return sqlSession.selectList("bookList");
		
	}
		
	// 책 등록
	@Override
	public void bookRegister(BookVO vo) {
			
		sqlSession.insert("bookRegister", vo);
			
	}

}
