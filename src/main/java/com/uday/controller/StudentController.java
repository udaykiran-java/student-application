package com.uday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uday.model.Student;
import com.uday.service.StudentService;

@Controller

public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public String homepage() {
		
		return "home";
	}
	@RequestMapping("/register")
	public String registerpage() {
		
		return "register";
	}
	@RequestMapping("/save")
	public String savepage(Student student) {
		
		service.saveStudent(student);
		return "success";
	}
	@RequestMapping("/viewall")
	public String viewallpage(ModelMap model) {
		
		model.put("students",service.getAllStudents());
		return "viewall";
		
	}
	@RequestMapping("/delete/{sid}")
	public String deleteform(@PathVariable int sid,ModelMap model) {
		
		service.deleteStudent(sid);
		return "redirect:/viewall";
		
	}
	@RequestMapping("/edit/{sid}")
	public String editform(@PathVariable int sid,ModelMap model) {
		
		model.put("command",service.getOneStudent(sid));
		
		return "edit";
	}
	@RequestMapping(value="editandsave",method=RequestMethod.GET)
	public String usersave(Student student,ModelMap model) {
		
		service.saveStudent(student);
		
		return "redirect:/viewall";
	}
}
