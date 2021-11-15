package com.cg.bean;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cg.bms.service.BookServiceImpl;
@Configuration  //spring version 4.0....
public class MyBookConfig 
{  @Bean //singleton
	public Loan loan() {
		Loan loan=new Loan();//99,"ICICIBank");
		return loan;
	}
@Bean
public BookServiceImpl bookServiceImpl() {
	BookServiceImpl bookServiceImpl=new BookServiceImpl();
	return bookServiceImpl;
}
	@Bean
	public Author author()
	{		
		return new Author("Kanetkar","Nagpur");

	}

	@Bean  
	public Book book()
	{
		Book book=new Book();
		book.setYear("1995");
		book.setIsbn("Kj77756");
		return book;

	}
	
	


}
