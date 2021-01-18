package com.employee;

import java.util.Arrays;

import com.employee.SingleLinkedList.Node;


public class TestYourCode {
	public static void testTeams(int[] even, int[] odd) {

		int[] testEven = { 190 ,188 ,186 ,180 ,176 ,174 ,172 ,166 ,160 ,156 ,140 };
		int[] testOdd = {197, 195, 189, 187, 183, 179, 177, 175, 169, 167, 165};

		if (Arrays.equals(even, testEven) && Arrays.equals(odd, testOdd)) {
			System.out.println("Congratulations! you formed the correct teams");
		} else {
			System.out.println("*************** Check your code again ***************");
		}

	}

	public static void testTwoBestPerformers(int best, int secondBest) {
		if (best == 156 && secondBest == 180) {
			System.out.println("Congratulations! You found the two best Performers");
		} else {
			System.out.println("*************** Check your code again ***************");
		}
	}

	public static void testSearchForAnEmployee(String str) {
		if (str.equals("3459119683")) {
			System.out.println("Congratulations! You found the searched employee with correct contact info");
		} else {
			System.out.println("*************** Check your code again ***************");
		}

	}

	public static void testHighestToMedianSalary(float ratio) {
		if (ratio == 1.8333334f) {
			System.out.println("Congratulations! You found the correct Ratio");
		} else {
			System.out.println("*************** Check your code again ***************");
		}

	}

	public static void testHighestContractSalaries(int[] topFive) {
		int[] testFive = {88000, 88000, 85000, 85000, 80000};
		if(Arrays.equals(topFive, testFive)) {
			System.out.println("Congratulations! You found the correct top Five Work Orders");
		} else {
			System.out.println("*************** Check your code again ***************");
		}

	}

	public static void testUniteSalaries(float ratio) {
		if (ratio == 1.8333334f) {
			System.out.println("Congratulations! You found the correct Ratio");
		} else {
			System.out.println("*************** Check your code again ***************");
		}
	}

	public static void testSimilarNamedTeams(int count) {
		if (count == 7) {
			System.out.println("Congratulations! You found the correct number of teams formed");
		} else {
			System.out.println("*************** Check your code again ***************");
		}
	}

	public static void testFrequencyOfVisitedWebsites(String[] res, int[] freq) {

		int[] knownFreq = {6,10,2,4};
		if (Arrays.equals(freq,knownFreq)) {
			System.out.println("Congratulations! You compiled the correct information");
		} else {
			System.out.println("*************** Check your code again ***************");
		}

	}

	

	public static void testFoodCouponDistribution(int front,int rear) {
		
		if (front == 123 && rear == 106 || front == 105 && rear == 106 || front == 105 && rear == 117 || front == 190 && rear == 117)  {
			System.out.println("Congratulations! You have successfully implemented the queue");
		} else {
			System.out.println("*************** Check your code again ***************");
		}
	}


	public static void testNewEmployeeStructure(int tail) {
		if(tail == 197) {
			System.out.println("Congratulations! You have formed the correct LinkedList");
		} else {
			System.out.println("*************** Check your code again ***************");
		}
	}

	public static void testAddNewEmployee(int position) {
		if(position == 11) {
			System.out.println("Congratulations! You have entered at the correct position");
		} else {
			System.out.println("*************** Check your code again ***************");
		}
		
	}

	public static void testRemoveAbscondedEmployee(int abscondedEmployee) {
		if(abscondedEmployee == 189) {
			System.out.println("Congratulations! You have removed the correct employee");
		} else {
			System.out.println("*************** Check your code again ***************");
		}		
	}

}
