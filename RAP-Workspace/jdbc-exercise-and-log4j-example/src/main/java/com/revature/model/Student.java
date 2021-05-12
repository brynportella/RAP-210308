package com.revature.model;

import java.sql.Date;

public class Student {
	private int id;
	private String name; 
	private double gpa; 
	private Date graduation;
	
	
	public Student() {}
	public Student(int id, String name, double gpa, Date graduation) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.graduation = graduation;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Date getGraduation() {
		return graduation;
	}
	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", graduation=" + graduation + "]";
	} 
	
	
}
