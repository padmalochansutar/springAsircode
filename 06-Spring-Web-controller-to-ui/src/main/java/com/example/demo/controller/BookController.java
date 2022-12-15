package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookData")
public class BookController {
	@GetMapping("/book")
	public String getBookData(Model model) {
		model.addAttribute("name", "spring Boot");
		model.addAttribute("price", 760.8);
		return "book";//returning logical view name
	}

}
