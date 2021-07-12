package com.ems.in.module;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	
	public Student() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	@Column
	private String sname;
	
	@ManyToMany(targetEntity = Courses.class)
	private List<Courses> courses;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
	
}
