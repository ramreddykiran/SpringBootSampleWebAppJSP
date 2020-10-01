package com.boot.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("welcome")
	//@ResponseBody
	public String control() {
		System.out.println("hello controller");
		
		return "welcome.jsp";
	}

}
