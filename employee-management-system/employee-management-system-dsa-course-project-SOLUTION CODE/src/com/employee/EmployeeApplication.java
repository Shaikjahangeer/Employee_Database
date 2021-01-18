package com.employee;

import java.io.IOException;


public class EmployeeApplication {

	public static void main(String[] args) throws IOException {
		// ************************************ DO NOT CHANGE ************************************

		int[] registeredEmployeesSample1 = { 123, 121, 140, 197, 180, 187, 183, 165, 167, 186, 105, 189, 101, 175, 188, 
				190, 106 };
		int[] registeredEmployeesSample2 = {111,132,174,122,156,157,123,117};
		// Fetching Employees from excel sheet using a method fetchEmployee of
		// FetchRecordsFromExcel Class
		FetchRecordsFromCSV fetchCSV = new FetchRecordsFromCSV();

		String[] browsingHistory = fetchCSV.getBrowsingHistory();
		String[] restrictedWebsites = fetchCSV.getRestrictedWesites();
		String permanentEmployeeFileName = "src/data/PermanentEmployeeRecords.csv";
		String contractEmployeeFileName = "src/data/ContractEmployeeRecords.csv";
		PermanentEmployee[] permanent = null;
		ContractEmployee[] contract = null;
		PermanentEmployee[] permanentLL = null;
		PermanentEmployee newEmployee = null;
		// ************************************ DO NOT CHANGE ************************************
		
		
		// ************************************ TODO 1.5 ************************************

		// Call method getPermanentEmployee of FetchRecordsFromCSV and
		// pass permanentEmployeeFileName as a parameter 
		// receive the data returned by method getPermanentEmployee into "permanent" object declared above

		
		// ************************************ SOLUTION 1.5 BEGIN ************************************
		permanent = fetchCSV.getPermanentEmployee(permanentEmployeeFileName);
		// ************************************ SOLUTION 1.5 END ************************************
		
		// ************************************ TO DO 1.6 ************************************
		
		// Call method getContractEmployee of FetchRecordsFromCSV and 
		// pass contractEmployeeFileName as a parameter
		// receive the data returned by method getContractEmployee into "contract" object declared above

		//************************************ SOLUTION 1.6 BEGIN ************************************
		contract = fetchCSV.getContractEmployee(contractEmployeeFileName);
		//************************************ SOLUTION 1.6 END ************************************

		// ************************************ TO DO 1.7 ************************************
		// Call method getPermanentEmployee of FetchRecordsFromCSV and
		// pass permanentEmployeeFileName as a parameter
		// receive the data returned by method getPermanentEmployee into "permanentLL" object declared above

		//************************************ SOLUTION 1.7 BEGIN ************************************
		permanentLL = fetchCSV.getPermanentEmployee(permanentEmployeeFileName);
		//************************************ SOLUTION 1.7 END ************************************
		

		System.out.println("===================PART A ==========================");
		PartA partA = new PartA();
		// implement the method createTeams(permanent) in PartA.java
		partA.createTeams(permanent);
		// implement the method findTwoBestPerformers(permanent) in PartA.java
		partA.findTwoBestPerformers(permanent);

		
		System.out.println("===================PART B ==========================");
		// implement the method searchForAnEmployee(permanent, 195) in PartB.java
		new PartB().searchForAnEmployee(permanent, 195);

		
		System.out.println("===================PART C ==========================");
		// implement the method getHighestToMedianSalary(permanent) in PartC.java
		PartC partC = new PartC();
		PermanentEmployee[] permanentSalaries = partC.getHighestToMedianSalary(permanent);
		
		
		System.out.println("===================PART D ==========================");
		// Implement the method getHighestContractSalaries(contract) in PartD.java
		PartD partD = new PartD();
		ContractEmployee[] contractSalaries = 	partD.getHighestContractSalaries(contract);
		// Implement unionOfSalaries(permanentSalaries, contractSalaries) in partD.java.
		partD.unionOfSalaries(permanentSalaries, contractSalaries);
		

		System.out.println("===================PART E ==========================");
		PartE partE = new PartE();
		// Implement the method getFrequencyOfVisitedWebsites(browsingHistory, restrictedWebsites) in PartE.java
		partE.getFrequencyOfVisitedWebsites(browsingHistory, restrictedWebsites);
		// Implement the method findSimilarNamedTeams(permanent) in PartE.java
		partE.findSimilarNamedTeams(permanent);

		
		System.out.println("===================PART F ==========================");
		PartF partF = new PartF();

		//Implement the method newEmployeeStructure(permanentLL) in PartF.java
		SingleLinkedList list =  partF.newEmployeeStructure(permanentLL);
		
		
		//ReInitialize newEmployee Object with the details given in the Problem Statement
		newEmployee = new PermanentEmployee(135, "Kshitij", 39, "2123456789", 70000, 60,"Mumbai");
		//Implement the method addNewEmployee(list, newEmployee) in PartF.java
		list = partF.addNewEmployee(list, newEmployee);
		
		// Implement the method removeAbscondedEmployee(list) in PartF.java 
		list = partF.removeAbscondedEmployee(list);
		
		System.out.println("===================PART G ==========================");
		// implement the method lineUpFoodCoupons(registeredEmployees) in PartG.java
		// implement the method distributeFoodCoupons(registeredEmployees) in PartG.java
		int couponCount1  = 10;
		int couponCount2  = 5;
		
		PartG partG = new PartG();
		
		Queue que = partG.lineUpFoodCoupons(registeredEmployeesSample1);
		que = partG.distributeFoodCoupons(couponCount1);
		
		que = partG.lineUpFoodCoupons(registeredEmployeesSample2);
		que = partG.distributeFoodCoupons(couponCount2);

		
		System.out.println("===================THE END==========================");

	}

}
