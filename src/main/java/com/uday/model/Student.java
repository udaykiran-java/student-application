package com.uday.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String name;
	private String course;
	private int html;
	private int hibernet;
	private int spring;
	private int springboot;
	private int total;
	private double persentage;
	private String grade;
	private String result;
	public Student() {
		super();
	}
	public Student(int sid, String name, String course, int html, int hibernet, int spring, int springboot, int total,
			double persentage, String grade, String result) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.html = html;
		this.hibernet = hibernet;
		this.spring = spring;
		this.springboot = springboot;
		this.total = total;
		this.persentage = persentage;
		this.grade = grade;
		this.result = result;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getHibernet() {
		return hibernet;
	}
	public void setHibernet(int hibernet) {
		this.hibernet = hibernet;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getSpringboot() {
		return springboot;
	}
	public void setSpringboot(int springboot) {
		this.springboot = springboot;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPersentage() {
		return persentage;
	}
	public void setPersentage(double persentage) {
		this.persentage = persentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", html=" + html + ", hibernet="
				+ hibernet + ", spring=" + spring + ", springboot=" + springboot + ", total=" + total + ", persentage="
				+ persentage + ", grade=" + grade + ", result=" + result + "]";
	}

}
