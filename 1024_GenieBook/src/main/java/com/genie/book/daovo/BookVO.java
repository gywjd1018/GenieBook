package com.genie.book.daovo;

import java.util.Date;

public class BookVO {

	private int bookNo;
	private String bookName;
	private String author;
	private String publisher;
	private String bookCategory;
	private Date bookDate;
	private String bookInfo;
	private String bookTable;
	private String bookPlot;
	private int stock;
	private int price;
	private int discount;
	private String bookType;
	private String coverImg;
	
	// 디폴트 생성자
	public BookVO() {
		super();
	}

	// 생성자
	public BookVO(int bookNo, String bookName, String author, String publisher, String bookCategory, Date bookDate,
			String bookInfo, String bookTable, String bookPlot, int stock, int price, int discount, String bookType,
			String coverImg) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.bookCategory = bookCategory;
		this.bookDate = bookDate;
		this.bookInfo = bookInfo;
		this.bookTable = bookTable;
		this.bookPlot = bookPlot;
		this.stock = stock;
		this.price = price;
		this.discount = discount;
		this.bookType = bookType;
		this.coverImg = coverImg;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getBookTable() {
		return bookTable;
	}

	public void setBookTable(String bookTable) {
		this.bookTable = bookTable;
	}

	public String getBookPlot() {
		return bookPlot;
	}

	public void setBookPlot(String bookPlot) {
		this.bookPlot = bookPlot;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getCoverImg() {
		return coverImg;
	}

	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}
	
}
