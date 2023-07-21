package com.yoon.book.service;

import java.util.List;

import com.yoon.book.models.UserDto;

public interface UserService {
	public List<UserDto> SelectAll();
	public int insert(UserDto userDto);
	
	public UserDto findByUCODE(String u_code);
	
	public int update(UserDto userDto);
}
