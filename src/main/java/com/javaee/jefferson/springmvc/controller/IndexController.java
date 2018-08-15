package com.javaee.jefferson.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.javaee.jefferson.springmvc.services.BookService;

@Controller
public class IndexController {

	private final BookService bookService;
	
	public IndexController(BookService bookService)
	{
		this.bookService = bookService;
	}
	
	public String getIndexPage(Model model)
	{
		model.addAttribute("books", bookService.getBooks());
		
		return "index";
	}
	
}
