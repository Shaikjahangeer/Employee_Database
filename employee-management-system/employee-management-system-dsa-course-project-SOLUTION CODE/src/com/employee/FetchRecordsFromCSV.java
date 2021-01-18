//************************************ DO NOT CHANGE ************************************
package com.employee;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.ArrayList;  

public class FetchRecordsFromCSV {
	
	public static ArrayList<ExcelList> readFromCSV(String fileName) throws IOException{
		String line = "";
		ArrayList<ExcelList> allEmployees = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		while((line = br.readLine())!=null) {
			String[] employee = line.split(",");
			ExcelList emp = new ExcelList();
			emp.setEmpId(Integer.parseInt(employee[0]));
			emp.setName(employee[1]);
			emp.setAge(Integer.parseInt(employee[2]));
			emp.setContact(employee[3]);
			emp.setCompensation(Integer.parseInt(employee[4]));
			emp.setRating(Integer.parseInt(employee[5]));
			emp.setExtraField(employee[6]);
			
			allEmployees.add(emp);
		}
		
		return allEmployees;
	}
	
	public String[] getBrowsingHistory() {
		String str[] = {"facebook","Instagram","YouTube","Upgrad","Instagram"," StackOverFlow","facebook",
				"facebook","google"," StackOverflow", "google", "Gmail", "upgrad", "espn","Youtube","Upgrad","Instagram"," StackOverFlow","facebook",
				"facebook","google"," StackOverflow", "google", "gmail","w3School","Upgrad","gmail","facebook","Instagram","Youtube","Upgrad","Instagram"," StackOverFlow","facebook",
				"Facebook","google"," StackOverflow", "Google", "Gmail", "upgrad", "Espn","Youtube","upgrad","Instagram"," Stackoverflow","facebook",
				"facebook","google"," stackOverflow", "google", "gmail","w3School","Upgrad","gmail"};
		
		return str;
	}

	public String[] getRestrictedWesites() {
		String[] str = {"Instagram","Facebook","Espn","Youtube"};
		
		return str;
	}
	
	//************************************ DO NOT CHANGE ************************************
		


	// ************************************ TODO 1.3 ************************************
	// Uncomment the method getPermanentEmployee
			
	public PermanentEmployee[] getPermanentEmployee(String fileName) throws IOException {
		ArrayList<ExcelList> empListPermanent = readFromCSV(fileName);
		if(empListPermanent.size() == 0) {
			System.out.println("The data in the PermanentEmployeeRecords.csv is missing");
			System.exit(0);
		}
		PermanentEmployee[] perm = new PermanentEmployee[empListPermanent.size()];
		int i = 0;

		for (ExcelList e : empListPermanent) {
			perm[i] = new PermanentEmployee(e.getEmpId(), e.getName(), e.getAge(), e.getContact(), e.getCompensation(),
					e.getRating(), e.getExtraField());
			i++;
		}

		return perm;

	}


	// ************************************ TODO 1.4 ************************************
	// Uncomment the method getContractEmployee
	
	public ContractEmployee[] getContractEmployee(String fileName) throws IOException {
		ArrayList<ExcelList> empListContract = readFromCSV(fileName);
		if(empListContract.size() == 0) {
			System.out.println("The data in the ContractEmployeeRecords.csv is missing");
			System.exit(0);
		}
		ContractEmployee[] contract = new ContractEmployee[empListContract.size()];
		int i = 0;

		for (ExcelList e : empListContract) {
			contract[i] = new ContractEmployee(e.getEmpId(), e.getName(), e.getAge(), e.getContact(),
					e.getCompensation(), e.getRating(), e.getExtraField());
			i++;
		}
		return contract;
	}
}