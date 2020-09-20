package com.krsna.sample2.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController { 
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping(value ="/employeeList")
	public ModelAndView showEmployeeListPage() {
		logger.info("EmployeeController.showEmployeeListPage()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeelist");
		return mv;
	}
	
	@GetMapping(value = "/employeeadd")
	public String showEmployeeAddPage() {
		logger.info("EmployeeController.showEmployeeAddPage()");
		logger.info("new statment");
		
		return "employeeadd"; //logic view name is returned here
	}

}
