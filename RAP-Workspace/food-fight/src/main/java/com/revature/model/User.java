package com.revature.model;


public abstract class User {
	private String username;
	private String password; 
	private String name;
	
	public User() {}
	
	
	public User(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	
	//Getters and setters, Accessors and Mutators 
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + "]";
	} 
	
	
}
