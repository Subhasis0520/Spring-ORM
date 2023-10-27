package com.entity;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private long id;
	private Date dob;
	private List<String> courses;
	private String gender;
	private String studentType;
	
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", studentType=" + studentType + ", address=" + address + "]";
	}
	
 
	
}
