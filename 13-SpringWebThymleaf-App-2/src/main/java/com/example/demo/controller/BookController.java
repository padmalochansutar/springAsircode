package com.example.demo.controller;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Book;

@Controller
public class BookController {
	@GetMapping(value = { "/","/addBook" })
	public String bookDetails(Model model) {
		model.addAttribute("book", new Book());
		return "bookData";
	}

}
