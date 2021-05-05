package com.revature.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtility {
	private static final String CONNECTION_USERNAME = "postgres"; 
	private static final String CONNECTION_PASSWORD = "password"; 
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5434/postgres" ; 
	private static Connection connection; 
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			//If the class is not found the driver could not be registered. 
			System.out.println("Could not register driver!");
			e.printStackTrace();
		}
		if (connection == null || connection.isClosed())
		 connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		return connection; 
	}

}
