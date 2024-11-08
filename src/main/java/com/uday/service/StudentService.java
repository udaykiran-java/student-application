package com.uday.service;

import java.util.List;

import com.uday.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getOneStudent(int sid);
	public void deleteStudent(int sid);
	public List<Student> getAllStudents();
	public Student updateStudent(Student student);


}
