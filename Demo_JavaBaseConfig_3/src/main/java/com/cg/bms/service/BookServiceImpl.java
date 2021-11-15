package com.cg.bms.service;

import java.util.ArrayList;

import com.cg.bean.Book;

public class BookServiceImpl implements BookService{
	
	ArrayList<Book> blist=new ArrayList<Book>();
	public void addBook(Book book) {
		blist.add(book);
		System.out.println(blist);
	}
	
	
	//deleteBook()
	
	//updateBook()
	
	//listallBooks() 
}
