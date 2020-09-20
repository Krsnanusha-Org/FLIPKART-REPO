package com.krsna.sample2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@GetMapping(name="/")
	public ModelAndView showIndexPage() {
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

}
