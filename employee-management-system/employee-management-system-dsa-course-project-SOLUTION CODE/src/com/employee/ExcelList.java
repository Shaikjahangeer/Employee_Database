//************************************ DO NOT CHANGE ************************************
package com.employee;

public class ExcelList {
	
	private int empId;
	private String name;
	private int age;
	private String contact;
	private int compensation;
	private int rating;
	private String extraField;
	
	public ExcelList(int empId, String name, int age, String contact, int compensation,int rating,String extraField) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.compensation = compensation;
		this.rating=rating;
		this.extraField=extraField;
	}
	
	public ExcelList() {
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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

	public String getExtraField() {
		return extraField;
	}

	public void setExtraField(String extraField) {
		this.extraField = extraField;
	}
	
}

//************************************ DO NOT CHANGE ************************************