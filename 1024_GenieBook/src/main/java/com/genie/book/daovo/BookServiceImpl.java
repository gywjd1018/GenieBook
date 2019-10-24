package com.genie.book.daovo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Inject
	BookDAO bookDAO;

	// 책 목록 보기
	@Override
	public List<BookVO> bookList() {
	
			return bookDAO.bookList();
			
	}
	
	// 책 등록
	@Override
	public void bookRegister(BookVO vo) {
		
		bookDAO.bookRegister(vo);
		
	}
	
}
