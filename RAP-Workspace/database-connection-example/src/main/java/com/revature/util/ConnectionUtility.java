package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demonstrate a simple connection and query
 * 
 * In project would be re-factored into a method that returns a connection 
 * object. See jdbc-exercise for an example of that. 
 * 
 * @author BrynPortella
 *
 */
public class ConnectionUtility {
	
	private static final Logger LOG = LogManager.getLogger(ConnectionUtility.class);
	
	private static final String CONNECTION_USERNAME = "postgres"; 
	private static final String CONNECTION_PASSWORD = "password"; 
	// Connection URL follows this format:
	//Protocol:// localhost or ip address or domain name:port number / database name
	//jdbc:postgresql://localhost:5432/database_name
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5434/food_fight" ; 
	
	public static void main(String[] args) {
		/*
		 * This code is responsible for registering the driver.
		 * The driver being the supporting code that enables the jdbc connection.
		 */
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			//If the class is not found the driver could not be registered. 
			LOG.fatal("Could not register driver!");
			e.printStackTrace();
		}
		
		/*
		 * Create a connection object. 
		 * Use the DriverManager and the appropriate connection credentials. 
		 * 
		 * This may throw a SQL exception. 
		 */
		try {
			Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
			LOG.debug("Connection is valid "+connection.isValid(5));
			String sql = "SELECT * FROM food_item_type WHERE type_of_food LIKE ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "%t%");
			ResultSet set = statement.executeQuery();
			LOG.trace("Executed query: "+sql); 
			while(set.next()) {
				LOG.info(set.getInt("type_id"));
				LOG.info(set.getString("type_of_food"));
			}
		}catch(SQLException ex) {
			LOG.fatal("Failure");
			ex.printStackTrace();
			
		}

	}
}
