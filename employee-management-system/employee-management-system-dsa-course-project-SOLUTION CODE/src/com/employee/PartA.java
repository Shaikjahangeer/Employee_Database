package com.employee;

public class PartA {

	public void createTeams(PermanentEmployee[] perm) {
		// ************************************ TODO A1 ************************************
		/*
		 * This method should print the even and odd teams along with their respective captains.
		 * 
		 * If there are less than 11 players in any of the team, Print
		 * "Teams cannot be formed"
		 * 
		 * Uncomment the line containing "TestYourCode.testTeams(evenTeam, oddTeam)" to test your code 
		 * Note : evenTeam and OddTeam are integer arrays containing employee Ids of evenTeam and oddTeam respectively.
		 */
		// ************************************ SOLUTION A1 BEGIN ************************************
		// Check if there are less than 22 employees 
		if(perm.length <22) {
			System.out.println("Teams cannot be formed");
			return;
		}
		// Take two arrays, one for each team of size 11
		// declaring an array for team with even Ids
		
		PermanentEmployee[] even = new PermanentEmployee[11];
		//declaring an array for team with odd Ids
		PermanentEmployee[] odd  = new PermanentEmployee[11];
		
		int length = perm.length-1;
		// Iterate over the array and get each employee ID to check whether it is even or odd.  
       // Hence, add the employee in the respective teams

		// iterating through all the employees to find the two 11s.
		for(int player=length,i=0,j=0;player>=0;player--) {
			PermanentEmployee tempEmployee = perm[player];
			if(tempEmployee != null) {
				// if employee id is even and 
				//number of players in the team currently has less than 11 players
				if(tempEmployee.getId() %2 == 0 && i<11) {
						even[i] = tempEmployee;
						i++;
				}
				// if employee id is even and 
				//number of players in the team currently has less than 11 players
				else if(j<11) {
						odd[j] = tempEmployee;
						j++;
				}
			}
		}
		// check if teams have 11 each or not. If not, print No such team can be formed
		//Else call a function to display the Id of each employee object by passing your team 
		//array as a parameter.
		//check if teams have 11 each or not.
		if(even[10] == null || odd[10] == null) {
			System.out.println("Teams cannot be formed");
		}
		else {
			
			// Printing the two teams 	
			int[] evenTeam = display(even);
			int[] oddTeam = display(odd);
			System.out.println();
			
			// Uncomment the line below to test your code
			TestYourCode.testTeams(evenTeam, oddTeam);
		}
	}
	
	//Implementing display such that the captain who is the employee present at median of the array, is printed first in the array.
	public int[] display(PermanentEmployee[] team) {
		
		int[] empTeam = new int[11];
		// determining Captain via Index of array
		int median = getMedian(team.length);
		// using getter to fetch id of each emp object and printing it.
		for(int i=0;i<team.length;i++) {
			System.out.print(team[i].getId() +" ");
			empTeam[i]=team[i].getId();
		}
		System.out.println();
		// Since arrays start from 0th Index
		System.out.println(team[median-1].getId());
		return empTeam;
	}
	
	public int getMedian(int len) {
		return (len+1)/2;
	}
	// ************************************ SOLUTION A1 END************************************
	
	
	
	public void findTwoBestPerformers(PermanentEmployee[] perm) {
		// ************************************ TODO A2 ************************************
		/*
		 * This method should print Employee ID, Name and Rating of the two Employees
		 * who have the maximum Ratings (100 being the best).
		 * 
		 * Uncomment the line containing TestYourCode.testTwoBestPerformers(bestPerformer.getId(), secondPerformer.getId())
		 * to test your code 
		 */
		//************************************ SOLUTION A2 BEGIN ************************************
		
		//find two best performers from permanent employees based on ratings and print them;
		if (perm.length < 2) {
			System.out.println("Invalid Input");
			return;
		}
		int bestPerformerRating = Integer.MIN_VALUE;
		int secondPerformerRating = Integer.MIN_VALUE;
		PermanentEmployee bestPerformer = null, secondPerformer = null;

		// iterating through Permanent employee array and comparing
		// current element with bestPerformer
		for (int i = 0; i < perm.length; i++) {
			// if current permanent employee has rating greater than bestPerformer
			// then update the bestPerformer
			if (perm[i].getRating() > bestPerformerRating) {
				secondPerformerRating = bestPerformerRating;
				bestPerformerRating = perm[i].getRating();
				secondPerformer = bestPerformer;
				bestPerformer = perm[i];
			}
			// else, if current permanent employee has rating greater than secondPerformer
			else if (perm[i].getRating() > secondPerformerRating) {
				secondPerformerRating = perm[i].getRating();
				secondPerformer = perm[i];
			}
		}

		System.out.println(bestPerformer.getId());
		System.out.println(secondPerformer.getId());

		// Uncomment the line below to test your code
		TestYourCode.testTwoBestPerformers(bestPerformer.getId(), secondPerformer.getId());
	        
	}
	// ************************************ SOLUTION A2 END ************************************
}

