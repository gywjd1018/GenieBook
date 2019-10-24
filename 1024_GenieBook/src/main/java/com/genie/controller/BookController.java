package com.genie.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.genie.book.daovo.BookService;
import com.genie.book.daovo.BookVO;


@Controller
public class BookController {
	
	@Inject
	BookService bookService;
	
	// å ���� �������� �̵�
	@RequestMapping(value="bookManagement.do" , method = { RequestMethod.GET, RequestMethod.POST })
	public String bookManagement(Model model1) {
			
		model1.addAttribute("bookList", bookService.bookList());
			
		return "bookManagement";
			
	}

	// å ���
	@RequestMapping(value = "bookRegister.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String bookRegister(Model model, HttpSession session, BookVO vo) {
		
		bookService.bookRegister(vo);
		
		return "bookInfo";
		
		
		
	}
	
}
