package com.productivity.dashboard.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.productivity.dashboard.services.ApplicationServices;


@Controller
public class Admin {

	private static final Logger logger = Logger.getLogger(Admin.class);
	private ApplicationServices appServices = ApplicationServices.getInstance();

	@RequestMapping("/admin")
	public ModelAndView login()
	{
		logger.debug("Application Starting");
		ModelAndView model = new ModelAndView("index");		
/*		int count = JdbcDaoImpl.getUserCount();*/

		//int count = ApplicationServices.retriveNumberOfUsers();
		int count = appServices.retriveNumberOfUsers();
		model.addObject("count",count);
		return model;
	}
}
