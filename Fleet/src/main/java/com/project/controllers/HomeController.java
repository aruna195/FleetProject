package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HomeController {
	
	@GetMapping(value="/")

	public String showHomePage() {
		
		System.out.println("In HomePage");
		
		return "home";
		
	}

}
