package com.krsna.sample2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.krsna.sample2.model.Product;
import com.krsna.sample2.service.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	ProductService productService;

	@GetMapping(name="/")
	public ModelAndView showIndexPage() {
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		List<Product> products = productService.listAll();
		mv.addObject("PRODUCT_LIST", products);
		return mv;
	}

}
