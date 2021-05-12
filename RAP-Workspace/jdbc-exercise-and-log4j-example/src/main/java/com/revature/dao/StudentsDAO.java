package com.revature.dao;

import java.util.List;

import com.revature.model.Student;

public interface StudentsDAO {
	public boolean createStudent(Student student); 
	public List<Student> getAllStudents(); 
}
