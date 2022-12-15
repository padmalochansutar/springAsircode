package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/data")
public class WishController {
	@GetMapping("/welcome")
	public String wishMsg(Model model) {
		model.addAttribute("msg", "god bless uu......");
		return "index";
	}

}
