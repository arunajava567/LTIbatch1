package com.cg.bms.model;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Value;

public class Book
{
	private String isbn;
		private String year;
		public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + "]";
	}
	

}
