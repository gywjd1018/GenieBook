package com.genie.book.daovo;

import java.util.List;

public interface BookDAO {

	// å ��� ����
	List<BookVO> bookList();
	
	// å ���
	void bookRegister(BookVO vo);

}
