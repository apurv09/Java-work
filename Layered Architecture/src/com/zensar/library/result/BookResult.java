package com.zensar.library.result;

import com.zensar.library.pojo.Book;

public class BookResult {	
	public void showBook(Book book) {
		
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}
}
