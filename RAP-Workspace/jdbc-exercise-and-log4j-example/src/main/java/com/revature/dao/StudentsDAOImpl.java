package com.revature.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Student;
import com.revature.utility.DAOUtility;

public class StudentsDAOImpl implements StudentsDAO {
	private Connection connection;
	private PreparedStatement statement;

	public boolean createStudent(Student student) {
		try {
			connection = DAOUtility.getConnection();
			String sql = "INSERT INTO students(name, gpa, graduation) VALUES(?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setDouble(2, student.getGpa());
			statement.setDate(3, student.getGraduation());
			return statement.executeUpdate() != 0;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}finally {
			closeResources(); 
		}

	}
	

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>(); 
		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT * FROM students";
			statement = connection.prepareStatement(sql);
			ResultSet allStudentRecords = statement.executeQuery();
			while(allStudentRecords.next()) {
				Student newStudent = new Student( allStudentRecords.getInt("id"),
						allStudentRecords.getString("name"),
						allStudentRecords.getDouble("gpa"),
						allStudentRecords.getDate("graduation"));
				students.add(newStudent);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}finally {
			closeResources(); 
		}
		return students; 
	}
	
	public static void main(String[] args) {
		Student s = new Student(100,"Dee", 3.4, Date.valueOf("2020-09-01"));
		StudentsDAO dao = new StudentsDAOImpl();
		System.out.println(dao.createStudent(s));
		for(Student currentStudent : dao.getAllStudents()) {
			System.out.println(currentStudent);
		}
	}
	

	private void closeResources() {
		try {
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			if(connection != null && !connection.isClosed()) {
				connection.close(); 
			}
		}catch(SQLException ex ) {
			ex.printStackTrace();
		}
	}

}
