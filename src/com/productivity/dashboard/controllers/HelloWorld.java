package com.productivity.dashboard.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.productivity.dashboard.dao.JdbcDaoImpl;
import com.productivity.dashboard.services.ApplicationServices;


@Controller
public class HelloWorld {

	private static final Logger logger = Logger.getLogger(HelloWorld.class);

	@RequestMapping("/")
	public ModelAndView login()
	{
		logger.debug("Application Starting");
		ModelAndView model = new ModelAndView("index");		
/*		int count = JdbcDaoImpl.getUserCount();*/
		int count = ApplicationServices.retriveNumberOfUsers();
		model.addObject("count",count);
		return model;
	}
}
