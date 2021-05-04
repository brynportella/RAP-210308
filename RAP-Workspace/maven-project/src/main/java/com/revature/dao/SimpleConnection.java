package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleConnection {

	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "password";
	private static final String URL = "jdbc:postgresql://localhost:5434/example";
	private static Connection connection;
	
	public static synchronized Connection getConnection() throws SQLException {
		if (connection == null) {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Could not register driver!");
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		
		//If connection was closed then retrieve a new connection
		if (connection.isClosed()){
			System.out.println("Opening new connection...");
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		return connection;
	}
	public static void main(String[] args) {
		try //(Connection connection = getConnection();){
		{	connection = getConnection(); 
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM sample");
			System.out.println("Connection is valid: "+ connection.isValid(5));
			ResultSet set = statement.executeQuery();
			System.out.println(set);
			statement.close();
			set.close();
			statement.close();
		}catch(SQLException ex) {
			System.out.println("Failure.");
			ex.printStackTrace();
		}
		
	}

}
