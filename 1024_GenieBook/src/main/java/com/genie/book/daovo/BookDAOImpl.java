package com.genie.book.daovo;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {
	
	// myBatis ���� ��ü 
	@Inject
	SqlSession sqlSession;
	
	// å ��� ����
	@Override
	public List<BookVO> bookList() {
		
		return sqlSession.selectList("bookList");
		
	}
		
	// å ���
	@Override
	public void bookRegister(BookVO vo) {
			
		sqlSession.insert("bookRegister", vo);
			
	}

}
