package com.yoon.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoon.book.models.BooksDto;
import com.yoon.book.service.BooksService;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class HomeController {
	
	protected final BooksService booksService;	
	public HomeController(BooksService booksService) {
		this.booksService = booksService;
	}


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<BooksDto> allBook = booksService.SelectAll();
		
		model.addAttribute("BOOKS",allBook);
		
		return "home";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String bookInsert(Model model) {
		model.addAttribute("BODY", "BINSERT");
		return "home";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String bookInsert(@ModelAttribute BooksDto booksDto) {
		int result = booksService.insert(booksDto);
		
		return "redirect:/";
	}
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String bookDetail(String bcode, Model model) {
		model.addAttribute("BODY","BUPDATE");
		BooksDto booksDto = booksService.findByBCODE(bcode);
		model.addAttribute("BOOK",booksDto);
		return "home";
	}
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public String bookDetail(@ModelAttribute BooksDto booksDto) {
		log.debug("DTO 결과 =============================={}", booksDto.toString());
		
		int result = booksService.update(booksDto);
		
		log.debug("결과--------------------------------------{}", result);
		return "redirect:/";
	}
	
	
	
	
}
