package com.genie.book.daovo;

import java.util.List;

public interface BookService {

	// å ��� ����
	public List<BookVO> bookList();
	
	// å ���
	void bookRegister(BookVO vo);
	
	

}
