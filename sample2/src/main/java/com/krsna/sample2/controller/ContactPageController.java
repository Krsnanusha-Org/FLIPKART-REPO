package com.krsna.sample2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.krsna.sample2.service.ContactService;

@Controller
public class ContactPageController {
	
	@Autowired
	ContactService contactService;
	
	@GetMapping(value = "/contact")
	public String showContactPage(ModelMap model) {
		String email = contactService.getContactEmail();
		model.put("EMAIL", email); //k,v
		model.put("AGE", 24);
		return "contact"; //view name[logical name]
	}

}
