package com.google.lecture.ch06.exc;

import java.util.Date;

public class Book {

//	field
	
	int bookSeq;
	int bookCategoryCd;
	String bookName;
	int bookStatus;
	String ISBN;
	String author;
	int publisherCd;
	Date pulicationDate;
	Date dateOfPurchase;
	String desc;
	
	
	
//	method
	
	public void borrowBook(int bookSeq) {
		bookStatus = 1;
	}
	public void returnBook(int bookSeq) {
		bookStatus = 2;
	}
	public void statusBook(int bookSeq) {
		System.out.println(bookStatus);
	}
}
