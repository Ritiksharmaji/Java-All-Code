package com.springboot.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String getString() {
		System.out.println("home page executed");
		return "home";
	}

	
	@RequestMapping("/contact")
	public String getConact() {
		System.out.println("conact page executed");
		return "contact";
	}

}
