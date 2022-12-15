package com.example.demo.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepo;
	@GetMapping("/loadForm")
	public String loadForm(Model model)  {
	    Product pobj=new Product();
//	    pobj.setProductId(101);
//	    pobj.setProductName("c++");
//	    pobj.setPrice(120.0);
//	    Date date =new Date();  
//	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
//	    String format = null;
//		
//			//Date	strDate = formatter.parse(date);
//			//System.out.println("Date Format with MM/dd/yyyy : "+strDate);
//			format = formatter.format(date);
//			Date strDate = null;
//			try {
//				strDate = formatter.parse(format);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	   
//	    pobj.setDate(strDate);
	    model.addAttribute("product",pobj);
	    return "index";
	}
	@PostMapping("/saveProduct")
	public String saveData(Product product,Model model) {
		//System.out.println("the date is:"+date);
		productRepo.save(product);
		System.out.println(product);
		model.addAttribute("msg", "product added successfully");
		return "dashboard";
		
		
	}

}
