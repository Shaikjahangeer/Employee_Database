package com.employee;

public class PartB {

	public void searchForAnEmployee(PermanentEmployee[] perm, int id) {
		// ************************************ TODO B1 ************************************
		/*
		 * This method should print the contact number of corresponding employee if
		 * present else the method should print : "Employee not in the records"
		 * 
		 * Uncomment the line containing "TestYourCode.testSearchForAnEmployee(str)" to test your code 
		 * Note : str is the contact number of the corresponding employee;
		 */
		
		// ************************************ SOLUTION B1 BEGIN ************************************
		// Binary Search given id. If present return the contact.
		// If not present return employee not present;
		String str = "Employee not in the records";
		int left = 0, right = perm.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			// checking if ID is at middle position.
			// if found, then return the contact of that ID.
			if (perm[mid].getId() == id) {

				str = perm[mid].getContact();
				break;
			}
			// if id to be searched is greater than the id in middle of array,
			// search in the right part of array.
			else if (perm[mid].getId() < id) {
				left = mid + 1;
			}
			// if id to be searched is smaller than the id in middle of array,
			// search in the left part of array.
			else {
				right = mid - 1;
			}
		}
		// if the id to be searched is not present,
		// inform that Employee not present in the records.
		System.out.println(str);

		// Uncomment below line to test your code
		TestYourCode.testSearchForAnEmployee(str);

		// ************************************ SOLUTION B1 END ************************************
	}
}
