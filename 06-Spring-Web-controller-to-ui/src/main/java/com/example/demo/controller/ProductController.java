package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Product;

@Controller
@RequestMapping("/productData")
public class ProductController {
	@GetMapping("/data")
	public ModelAndView productData() {
		ModelAndView mAndView=new ModelAndView();
	    Product product=new Product();
	    product.setProdId(101);
	    product.setProdName("oil");
	    product.setSalary(760.0);
	    mAndView.addObject("data", product);
	    mAndView.setViewName("product");
		return mAndView;
	}

}
