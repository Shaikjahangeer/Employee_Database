package com.employee;

//************************************ TODO 1.2 ************************************
//Implement ContractEmployee class which inherits the properties of Employee class


public class ContractEmployee extends Employee {
	//************************************ SOLUTION 1.2 BEGIN ************************************
	private String project;

	public ContractEmployee(int id, String name, int age, String contact, int compensation,int rating,String project) {
		super(id,name,age,contact,compensation,rating);

		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	//************************************ SOLUTION 1.2 END **************************************
}
