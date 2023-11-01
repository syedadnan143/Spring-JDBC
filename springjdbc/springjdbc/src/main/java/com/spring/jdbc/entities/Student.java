package com.spring.jdbc.entities;

public class Student {
   private int ID;
   private String name;
	 private String city;
	public Student(int iD, String name, String city) {
		super();
		ID = iD;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "jdbctemplate [ID=" + ID + ", name=" + name + ", city=" + city + "]";
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

}
