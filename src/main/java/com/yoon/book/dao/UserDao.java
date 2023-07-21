package com.yoon.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yoon.book.models.UserDto;

public interface UserDao {
	
	@Select("SELECT * FROM tbl_users ORDER BY u_code")
	public List<UserDto> SelectAll();
	
	public int insert(UserDto userDto);
	
	public UserDto findByUCODE(String u_code);
	
	public int update(UserDto userDto);
	
	public String findByUNAMETEL(UserDto userDto);
	
}
