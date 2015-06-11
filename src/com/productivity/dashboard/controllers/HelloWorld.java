package com.productivity.dashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping("/")
	public ModelAndView login()
	{
		ModelAndView model = new ModelAndView("index");		
		return model;
	}
}
