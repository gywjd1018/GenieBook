package com.genie.book.daovo;

import java.util.List;

public interface BookService {

	// 책 목록 보기
	public List<BookVO> bookList();
	
	// 책 등록
	void bookRegister(BookVO vo);
	
	

}
