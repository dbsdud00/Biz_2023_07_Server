package com.yoon.book.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yoon.book.dao.BooksDao;
import com.yoon.book.models.BooksDto;
import com.yoon.book.service.BooksService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BooksServiceImplV1 implements BooksService {

	
	protected final BooksDao booksDao;	
	public BooksServiceImplV1(BooksDao booksDao) {
		this.booksDao = booksDao;
	}



	@Override
	public List<BooksDto> SelectAll() {
		
		return booksDao.SelectAll();
	}



	@Override
	public int insert(BooksDto booksDto) {
		log.debug(booksDto.toString());
		BooksDto noneDto = booksDao.findByBCODE(booksDto.getB_code());
		if(noneDto != null) {
			return -1;
		}
		noneDto = booksDao.findByBNAME(booksDto.getB_name());
		if (noneDto != null) {
			return -1;
		}
		return booksDao.insert(booksDto);
	}



	@Override
	public BooksDto findByBCODE(String b_code) {
		BooksDto findbook = booksDao.findByBCODE(b_code);
		return findbook;
	}



	@Override
	public int update(BooksDto booksDto) {
		log.debug("service");
		log.debug(booksDto.toString());
		int result = booksDao.update(booksDto);
		return result;
	}



	@Override
	public BooksDto findByBNAME(String b_name) {
		BooksDto result = booksDao.findByBNAME(b_name);
		return result;
	}

}
