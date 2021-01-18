package com.employee;

//************************************ TODO 1.1 ************************************
//Implement PermanentEmployee class which inherits the properties of Employee class 


public class PermanentEmployee extends Employee  {

	//************************************ SOLUTION 1.1 BEGIN ************************************

	private String location;
	
	public PermanentEmployee(int id, String name, int age, String contact, int compensation,int rating,String location) {
		super(id,name,age,contact,compensation,rating);
		this.location=location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	//************************************ SOLUTION 1.1 END ************************************
}