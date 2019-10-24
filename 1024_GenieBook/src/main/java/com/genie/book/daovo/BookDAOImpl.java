package com.genie.book.daovo;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {
	
	// myBatis ���� ��ü 
	@Inject
	SqlSession sqlSession2;
	
	// å ��� ����
	@Override
	public List<BookVO> bookList() {
		
		return sqlSession2.selectList("bookList");
		
	}
		
	// å ���
	@Override
	public void bookRegister(BookVO vo) {
			
		sqlSession2.insert("bookRegister", vo);
			
	}

}
