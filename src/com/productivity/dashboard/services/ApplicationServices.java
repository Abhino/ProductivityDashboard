package com.productivity.dashboard.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.productivity.dashboard.dao.JdbcDaoImpl;

public class ApplicationServices {
	
	private static final Logger logger = Logger.getLogger(ApplicationServices.class);

	private static JdbcDaoImpl jdbcDao;
	
	public static JdbcDaoImpl getJdbcDao() {
		return jdbcDao;
	}

	public static void setJdbcDao(JdbcDaoImpl jdDao) {
		jdbcDao = jdDao;
	}

	public static int retriveNumberOfUsers(){
		logger.debug("Returning count");
		return JdbcDaoImpl.getUserCount();
	}



}
