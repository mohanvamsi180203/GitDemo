package com.gitdemo;


public class User {

	private String name;
	private String institute;
	private String course;
	
	
	public User() {
		super();
	}
	public User(String name, String institute, String course) {
		super();
		this.name = name;
		this.institute = institute;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}
