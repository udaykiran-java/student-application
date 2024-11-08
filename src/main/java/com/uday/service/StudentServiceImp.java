package com.uday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uday.model.Student;
import com.uday.repo.Studentrepo;

public class StudentServiceImp implements StudentService {

	@Autowired
	private Studentrepo repo; 
	@Override
	public Student saveStudent(Student student) {
		int total=0;
		double per=0.0;
		String grade=null;
		String result=null;
		total=student.getHtml()+student.getHibernet()+student.getSpring()+student.getSpringboot();
		per=total/4;
		if(per>=70) {
			grade="A grade";
		}
		else if(per>=60&&per<70) {
			grade="B grade";
		}
		else if(per>=50&&per<60) {
			grade="C grade";
		}
		else if(per>=40&&per<50) {
			grade="D grade";
		}
		else {
			grade="E grade";
		}
		
		if(student.getHtml()>=35&&student.getHibernet()>=35&&student.getSpring()>=35&&student.getSpringboot()>=35) {
			result="PASS";
		}
		else {
			result="FAIL";
		}
		student.setTotal(total);
		student.setPersentage(per);
		student.setGrade(grade);
		student.setResult(result);
		Student savestudent=repo.save(student);
		return savestudent;
		
	}

	@Override
	public Student getOneStudent(int sid) {
		Student getone=repo.findById(sid).get();
		return getone;
	}

	@Override
	public void deleteStudent(int sid) {
		
		repo.deleteById(sid);

	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> allstudents=repo.findAll();
		return allstudents;
	}

	@Override
	public Student updateStudent(Student student) {
		
		Student std=repo.save(student);
		return std;
	}
}
