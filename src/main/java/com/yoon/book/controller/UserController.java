package com.yoon.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoon.book.models.BooksDto;
import com.yoon.book.models.UserDto;
import com.yoon.book.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {
	
	protected final UserService userService;
	
	
	public UserController(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<UserDto> allUser = userService.SelectAll();
		
		model.addAttribute("USERS",allUser);
		model.addAttribute("BODY","USERLIST");
		
		return "home";
	}
	@RequestMapping(value = "/user/insert", method = RequestMethod.GET)
	public String userInsert(Model model) {
		model.addAttribute("BODY","UINSERT");
		return "home";
	}
	
	@RequestMapping(value = "/user/insert", method = RequestMethod.POST)
	public String userInsert(@ModelAttribute UserDto userDto) {
		log.debug(userService.findByUNAMETEL(userDto)+"==============================================@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		if(userService.findByUNAMETEL(userDto) < 1) {
			return "redirect:/user/insert";
		}
		int result = userService.insert(userDto);
		return "redirect:/user";
	}
	@RequestMapping(value = "/user/detail", method = RequestMethod.GET)
	public String bookDetail(String ucode, Model model) {
		UserDto userDto = userService.findByUCODE(ucode);
		model.addAttribute("USER",userDto);
		model.addAttribute("BODY","UUPDATE");
		return "home";
	}
	@RequestMapping(value = "/user/detail", method = RequestMethod.POST)
	public String bookDetail(@ModelAttribute UserDto userDto) {

		int result = userService.update(userDto);
		
		return "redirect:/user";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
