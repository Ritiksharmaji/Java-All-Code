package com.springboot.test;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	int a = 10;
	int b = 20;
	@RequestMapping("/add")
	@ResponseBody
	public String getdata() {
		
		return "adding of two number are : "+(a+b);
		
	}
	@RequestMapping("/sub")
	@ResponseBody
	public String substraction() {
		return "adding of two number are : "+(a-b);
		
	}

}
