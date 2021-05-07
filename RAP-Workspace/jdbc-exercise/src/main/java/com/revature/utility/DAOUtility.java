package com.revature.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAOUtility {
	private static String CONNECTION_USERNAME; 
	private static String CONNECTION_PASSWORD; 
	private static String CONNECTION_URL ; 
	private static Connection connection; 
	static {
		try {
			FileInputStream fileStream = new FileInputStream("C:\\Users\\BrynPortella\\Documents\\RAP-210308\\RAP-workspace\\jdbc-exercise\\src\\main\\resources\\application.properties"); 
			Properties properties = new Properties(); 
			properties.load(fileStream);
			CONNECTION_URL = properties.getProperty("URL");	
			CONNECTION_PASSWORD = properties.getProperty("CONNECTION_PASSWORD"); 
			CONNECTION_USERNAME = properties.getProperty("CONNECTION_USERNAME"); 
		}catch(IOException ex) {
			System.out.println("Failure.");
			ex.printStackTrace();
		}
		
	}
	
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
