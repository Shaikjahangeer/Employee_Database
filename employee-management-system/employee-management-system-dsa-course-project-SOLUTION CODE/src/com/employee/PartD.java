package com.employee;

public class PartD {
	
	public ContractEmployee[] getHighestContractSalaries(ContractEmployee[] conSal) {
		// ************************************ TODO D1 ************************************
		/*
		 * This method should print the TOP FIVE Compensations of the Contract Employees.
		 * This method should return a sorted array of ContractEmployee based on compensation
		 * 
		 * Uncomment the line "TestYourCode.testHighestContractSalaries(topFive)" to test your code 
		 * Note : topFive is an integer array that consists of all the top 5 Compensations 
		 * 
		 */
		// ************************************ SOLUTION D1 BEGIN ************************************

		// Since we are implementing quick Sort, we pass the array to be sorted, and the range in form of (left,right)
		int len = conSal.length;

		arrangeContractSalaries(conSal, 0, len - 1);
		int size = (conSal.length>5 ? 5 : conSal.length);
		int[] topFive = new int[size];

		for (int i = 0; i < size; i++) {
			topFive[i] = conSal[len - 1 - i].getCompensation();
			System.out.println(topFive[i]);
		}

		// Uncomment the line below to test your code
		TestYourCode.testHighestContractSalaries(topFive);

		return conSal;
	}
	
	public void arrangeContractSalaries(ContractEmployee[] conSal, int left, int right) {
		if(left < right) {
			int divide = partitionWithPivot(conSal,left,right);
			
			arrangeContractSalaries(conSal,left,divide-1);
			arrangeContractSalaries(conSal,divide+1,right);
		}
		
	}
	
	// this function takes rightmost element as pivot and places it in it's correct position in sorted array.
	// the smaller elements are grouped in left of that element and 
	// the greater elements are grouped in right of that element.
	public int partitionWithPivot(ContractEmployee[] conSal, int left, int right) {
		
		int pivot = conSal[right].getCompensation();
		int smallerElementIndex = left-1;
		
		for(int i = left;i<right;i++) {
			if(conSal[i].getCompensation() <= pivot) {
				smallerElementIndex++;
				
				ContractEmployee tempObj = conSal[smallerElementIndex];
				conSal[smallerElementIndex] = conSal[i];
				conSal[i] = tempObj;
			}
		}
		
		ContractEmployee tempObj = conSal[smallerElementIndex+1];
		conSal[smallerElementIndex+1] = conSal[right];
		conSal[right] =tempObj;
		
		return smallerElementIndex+1;
	}
	
	//************************************ SOLUTION D1 END ************************************
	
	
	
	public void unionOfSalaries(PermanentEmployee[] sortedPerm, ContractEmployee[] sortedCon) {
		// ************************************ TODO D2 ************************************
		// This method should print the ratio of Highest to Median Compensation of all employees
		
		// Uncomment the line "TestYourCode.testUniteSalaries(ratio)" to test your code
		// Note : ratio is a float value
		
		//************************************ SOLUTION D2 BEGIN ************************************
		int[] unionOfSalaries = new int[sortedPerm.length + sortedCon.length];
		// using variables i,j,k to maintain indexes of permanent, contract and united
		// employee array respectively
		int i = 0, j = 0, k = 0;
		// implementing merge function to sort and arrange the compensations.
		while (i < sortedPerm.length && j < sortedCon.length) {

			if (sortedPerm[i].getCompensation() < sortedCon[j].getCompensation()) {
				unionOfSalaries[k] = sortedPerm[i++].getCompensation();
				k++;

			} else {
				unionOfSalaries[k++] = sortedCon[j++].getCompensation();
			}
		}

		while (i < sortedPerm.length) {
			unionOfSalaries[k++] = sortedPerm[i++].getCompensation();
		}

		while (j < sortedCon.length) {
			unionOfSalaries[k++] = sortedCon[j++].getCompensation();
		}

		// we have the union of both arrays based on compensation. Now finding ratio.
		int length = unionOfSalaries.length;
		float median = findMedian(unionOfSalaries);

		float ratio = unionOfSalaries[length - 1] / median;
		System.out.println(ratio);

		// Uncomment the line below to test your code
		TestYourCode.testUniteSalaries(ratio);
	}
	
	public float findMedian(int[] unionOfSalaries) {
		if(unionOfSalaries.length%2 == 0) {
			return (unionOfSalaries[(unionOfSalaries.length-1)/2] + unionOfSalaries[unionOfSalaries.length/2]) /2.0f;
		}
		else {
			return unionOfSalaries[unionOfSalaries.length/2];
		}
	}
	
	//************************************ SOLUTION D2 END ************************************
}
