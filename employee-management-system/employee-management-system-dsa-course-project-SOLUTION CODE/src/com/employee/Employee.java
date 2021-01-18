package com.employee;
//************************************ DO NOT CHANGE ************************************
public class Employee {

	private int id;
	private String name;
	private int age;
	private String contact;
	private int compensation;
	private int rating;

	public Employee(int id,String name,int age, String contact, int compensation,int rating) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.compensation = compensation;
		this.rating=rating;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getCompensation() {
		return compensation;
	}
	public void setCompensation(int compensation) {
		this.compensation = compensation;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
//************************************ DO NOT CHANGE ************************************