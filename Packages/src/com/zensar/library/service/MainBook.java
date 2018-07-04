package com.zensar.library.service;

import com.zensar.library.pojo.Book;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setId(1);
		book.setName("ABCV");
		book.setPrice(454.21f);
		book.getId();
		book.getName();
		book.getPrice();
	}

}
