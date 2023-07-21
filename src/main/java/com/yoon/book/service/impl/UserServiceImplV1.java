package com.yoon.book.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yoon.book.dao.UserDao;
import com.yoon.book.models.UserDto;
import com.yoon.book.service.UserService;

@Service
public class UserServiceImplV1 implements UserService {

	protected final UserDao userDao;
	
	
	public UserServiceImplV1(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public List<UserDto> SelectAll() {
		
		return userDao.SelectAll();
	}


	@Override
	public int insert(UserDto userDto) {
		// TODO Auto-generated method stub
		return userDao.insert(userDto);
	}


	@Override
	public UserDto findByUCODE(String u_code) {
		UserDto findUser = userDao.findByUCODE(u_code);
		return findUser;
	}


	@Override
	public int update(UserDto userDto) {
		// TODO Auto-generated method stub
		return userDao.update(userDto);
	}




}
