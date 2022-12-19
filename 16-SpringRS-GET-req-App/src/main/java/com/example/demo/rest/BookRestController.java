package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.Book;

@RestController
public class BookRestController {
	@GetMapping("/book")
	public Book getBookdata() {
		Book book=new Book(101,"spring",450.00);
		return book;
	}
	@PostMapping("/book")
	public Book getdata() {
		Book book=new Book(101,"spring",450.00);
		return book;
	}

}
