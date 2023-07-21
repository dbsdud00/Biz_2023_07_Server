package com.yoon.book.service;

import java.util.List;

import com.yoon.book.models.BooksDto;

public interface BooksService {
	
	public List<BooksDto> SelectAll();
	
	public int insert(BooksDto booksDto);
	
	public BooksDto findByBCODE(String b_code);
	
	public int update(BooksDto booksDto);
	
	public BooksDto findByBNAME(String b_name);
}
