package com.genie.book.daovo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Inject
	BookDAO bookDAO;

	// å ��� ����
	@Override
	public List<BookVO> bookList() {
	
			return bookDAO.bookList();
			
	}
	
	// å ���
	@Override
	public void bookRegister(BookVO vo) {
		
		bookDAO.bookRegister(vo);
		
	}
	
}
