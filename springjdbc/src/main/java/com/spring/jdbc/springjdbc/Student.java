package com.spring.jdbc.springjdbc;

public class Student {
	 private int ID;
	 @Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", city=" + city + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int iD, String name, String city) {
		super();
		ID = iD;
		this.name = name;
		this.city = city;
	}
	private String name;
	 private String city;
	 

}
