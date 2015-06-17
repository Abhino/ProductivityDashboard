package com.productivity.dashboard.services;

import org.apache.log4j.Logger;

import com.productivity.dashboard.dao.JdbcDaoImpl;

public class ApplicationServices {
	
	private static final Logger logger = Logger.getLogger(ApplicationServices.class);

	private static ApplicationServices appServices = null;
		
	public static ApplicationServices getInstance(){
		if(appServices == null){
			appServices = new ApplicationServices();
		}
		
		return appServices;
	}

	public int retriveNumberOfUsers(){
		logger.debug("Returning count");
		return JdbcDaoImpl.getUserCount();
	}

	

}
