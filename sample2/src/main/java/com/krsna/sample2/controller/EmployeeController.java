package com.krsna.sample2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@GetMapping(value ="/employeeList")
	public ModelAndView showEmployeeListPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeelist");
		return mv;
	}
	
	@GetMapping(value = "/employeeadd")
	public String showEmployeeAddPage() {
		
		return "employeeadd"; //logic view name is returned here
	}

}
