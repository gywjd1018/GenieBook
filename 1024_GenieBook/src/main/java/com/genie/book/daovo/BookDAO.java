package com.genie.book.daovo;

import java.util.List;

public interface BookDAO {

	// 책 목록 보기
	List<BookVO> bookList();
	
	// 책 등록
	void bookRegister(BookVO vo);

}
