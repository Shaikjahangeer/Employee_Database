package com.employee;

public class PartC {

	public PermanentEmployee[] getHighestToMedianSalary(PermanentEmployee[] perm) {
		// ************************************ TODO C1 ************************************
		/*
		 * This method should print the ratio of Highest Salary to Median Salary of the permanent employees
		 * 
		 * This method should return a sorted array of the PermanentEmployee, based on compensation.
		 * 
		 * 
		 * Uncomment the line "TestYourCode.testHighestToMedianSalary(ratio)" to test your code 
		 * Note : Pass the desired ratio as a float value
		 */

		// ************************************ SOLUTION C1 BEGIN ************************************

		int length = perm.length;
		
		// Nested loop in to compare compensation
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (perm[j].getCompensation() > perm[j + 1].getCompensation()) {

					// Swapping the two salaries
					PermanentEmployee tempEmployee = perm[j];
					perm[j] = perm[j + 1];
					perm[j + 1] = tempEmployee;

				}
			}
		}

		// finding median index to find median compensation
		float median = findMedian(perm,length);
		float ratio = perm[length - 1].getCompensation() / median;
		System.out.println(ratio);
		
		
		 // Uncomment the line below to test your code
		TestYourCode.testHighestToMedianSalary(ratio);

		return perm;
	}
	
	public float findMedian(PermanentEmployee[] perm, int length) {
		if(length%2 == 0) {
			return (perm[(length-1)/2].getCompensation() + perm[length/2].getCompensation()) /2.0f;
		}
		else {
			return perm[length/2].getCompensation();
		}
	}
	
	// ************************************ SOLUTION C1 END ************************************
}
