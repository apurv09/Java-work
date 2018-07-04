package com.zensar.library.services;

import com.zensar.library.pojo.Book;
import com.zensar.library.result.BookResult;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		book.setId(145);
		book.setName("asd");
		book.setPrice(5555.052f);
		
		BookResult bookresult=new BookResult();
		
		bookresult.showBook(book);
	}

}
