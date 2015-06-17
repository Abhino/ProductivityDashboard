package com.productivity.dashboard.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.productivity.dashboard.services.ApplicationServices;

@Controller
public class DashboardController {

	private static final Logger logger = Logger.getLogger(DashboardController.class);
	private ApplicationServices appServices = ApplicationServices.getInstance();

	@RequestMapping("/")
	public ModelAndView login()
	{
		logger.debug("Application Starting");
		ModelAndView model = new ModelAndView("index");		
		int count = appServices.retriveNumberOfUsers()+100;
		model.addObject("count",count);
		return model;
	}

}
