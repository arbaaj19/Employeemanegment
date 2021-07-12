package com.ems.in.module;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	
	public Courses() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	@Column
	private String cname;
	@ManyToMany(targetEntity = Student.class)
	private List<Student> student;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	} 
	
	

}
