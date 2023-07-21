package com.yoon.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yoon.book.models.BooksDto;

public interface BooksDao {
	
	@Select("SELECT * FROM tbl_books ORDER BY b_code")
	public List<BooksDto> SelectAll();
	
	public int insert(BooksDto booksDto);
	
	public BooksDto findByBCODE(String b_code);
	
	public int update(BooksDto booksDto);
}
