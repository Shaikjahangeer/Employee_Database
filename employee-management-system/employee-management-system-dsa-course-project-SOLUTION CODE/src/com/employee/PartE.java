package com.employee;

import java.util.Arrays;

public class PartE {

	public void getFrequencyOfVisitedWebsites(String[] browsingHistory, String[] restrictedWebsites) {
		// ************************************ TODO E1 ************************************
		/*
		 * This method should print :
		 * <<WebsiteName>>:<<Frequency>>
		 * <<WebsiteName>>:<<Frequency>>
		 * 
		 * For Example :  Instagram:3 
		 * 				  Facebook:0
		 * 
		 * Pass the frequency in an array in order of the websites.
		 * 
		 * Uncomment the line "TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites,freq)" to test your code
		 * Note : 	restrictedWebsites is String array given
		 * 			freq is an integer array which contains the frequency of corresponding restrictedWebsites
		 */
		// ************************************ SOLUTION E1 BEGIN ************************************
		String str = "";
		int[] freq = new int[restrictedWebsites.length];
		// iterating through restricted websites and selecting each to get frequency.
		int i=0;
		for (String website : restrictedWebsites) {
			freq[i]  = getFrequency(browsingHistory, website);
			System.out.println( website+ ":" + freq[i]);
			 i++;
		}
		
		//Uncomment the line below to test your code
		TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites,freq);
		
	}

	private int getFrequency(String[] browsingHistory, String website) {
		int count = 0;
		for (String browse : browsingHistory) {
			if (website.equalsIgnoreCase(browse)) {
				count++;
			}
		}
		return count;
	}
	// ************************************ SOLUTION E1 END ************************************
	
	
	
	public void findSimilarNamedTeams(PermanentEmployee[] perm) {
		// ************************************ TODO E2 ************************************
		/*
		 * This method should print number of teams
		 * 
		 * Uncomment the line "TestYourCode.testSimilarNamedTeam(count)" to test your code 
		 * Note : Here, count is an integer data type storing the number of teams that can be formed.
		 */

		// ************************************ SOLUTION E2 BEGIN ************************************
		
		// fetching the names from perm object
		String[] names = new String[perm.length];
		for(int i = 0; i < perm.length; i++) {
			names[i] = perm[i].getName().toLowerCase();
		}
		
		// sorting each Name
		names = getIndividualSortedNames(names);
		
		
		//Arranging names Alphabetically
		Arrays.sort(names);

		// keep count of teams formed 	
		int count =0;
		for(int i = 0; i < names.length - 1 ; i++) {
			if(isAnagram(names[i], names[i+1])) {
				count++;
				i++;
			}
		}

		System.out.println(count);
		// Uncomment line below to test your code
		TestYourCode.testSimilarNamedTeams(count);
	}
	
	private String[] getIndividualSortedNames(String[] names) {
		for(int i = 0; i < names.length ; i++) {
			char[] temp = names[i].toCharArray();
			Arrays.sort(temp);
			names[i] = new String(temp);
		}
		return names;
	}

	private boolean isAnagram(String name1, String name2) {
				
		char[] name1arr = name1.toCharArray();
		char[] name2arr = name2.toCharArray();
		
		Arrays.sort(name1arr);
		Arrays.sort(name2arr);
		
		if(Arrays.equals(name1arr, name2arr))
			return true;
		
		return false;
	}
	
	//************************************ SOLUTION E2 END ************************************
}