package com.productivity.dashboard.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDaoImpl {
	
	private static final Logger logger = Logger.getLogger(JdbcDaoImpl.class);

	private static JdbcTemplate jdbcTemplate;
	
	private JdbcDaoImpl(){		
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemp) {
		jdbcTemplate = jdbcTemp;
	}
	
	public static int getUserCount(){
		String sql = "select count(*) from dashboard";
		int NoOfUsers = jdbcTemplate.queryForObject(sql,Integer.class);
		logger.debug("Number of users retrived from DB:" + NoOfUsers);
		System.out.println(NoOfUsers);
		return NoOfUsers;
	}

}
/*	public static void getValue(){
Connection conn = null;
String driver = "com.mysql.jdbc.Driver";
try {
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection("jdbc:mysql://localhost/test");
	logger.debug(dataSource);
	conn = dataSource.getConnection();
	Statement statement = conn.createStatement();
	ResultSet rs = statement.executeQuery("SELECT * from dashboard");
	while (rs.next()) {	 
		String userid = rs.getString("User");
		String tasks = rs.getString("TaskCount");
		logger.debug("userid : " + userid);
		logger.debug("tasks : " + tasks);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
finally{
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
*/