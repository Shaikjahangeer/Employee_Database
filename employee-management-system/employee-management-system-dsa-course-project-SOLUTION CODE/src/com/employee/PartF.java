package com.employee;

import com.employee.SingleLinkedList.Node;

public class PartF {
	
	SingleLinkedList empList = new SingleLinkedList();

	public SingleLinkedList newEmployeeStructure(PermanentEmployee[] perm) {
		// ************************************ TODO F2 ************************************
		/*
		 * This method should form a linkedlist containing objects of type
		 * PermanentEmployee and should return the linkedlist
		 *
		 * You are required to implement LinkedList from scratch and add all the objects
		 * of perm array to your linked List
		 *
		 * Uncomment line "TestYourCode.testNewEmployeeStructure(tailId)" to test your code
		 * Note : this method takes the id (of type integer) to which the tail is pointing to,
		 * in the linkedList as a parameter.
		 *
		 */
		// ************************************ SOLUTION F2 BEGIN ************************************

		for (int i = 0; i < perm.length; i++) {
			empList.addNode(perm[i]);
		}
		
		int tailId = empList.tail.empObj.getId();
		
		System.out.println(tailId);
		
		//Uncomment the line below to test your code
		TestYourCode.testNewEmployeeStructure(tailId);
		
		return empList;
	}
	// ************************************ SOLUTION F2 END ************************************
	


	public SingleLinkedList addNewEmployee(SingleLinkedList empList, PermanentEmployee perm) {
		// ************************************ TODO F3 ************************************
		/*
		 * This method should add an employee in the linkedlist
		 * and return the updated linkedlist
		 * Note : the linked list remains ordered based on the permanent Ids
		 *
		 * Uncomment line "TestYourCode.testAddNewEmployee(position)" to test your code
		 * Note : this method takes the position of type integer at which the object is added as a parameter
		 *
		 */

		// ************************************ SOLUTION F3 BEGIN ************************************
		Node newEmployee = empList.new Node(perm);
		// if Linkedlist is empty or insert at begin 
		int position = 1;
		if (empList.head == null || empList.head.empObj.getId() >= newEmployee.empObj.getId()) {

			newEmployee.next = empList.head;
			empList.head = newEmployee;
			
			System.out.println(position);
			return empList;
		}

		// find correct position to enter newEmployee
		Node current = empList.head;
		while (current.next != null && current.next.empObj.getId() < newEmployee.empObj.getId()) {
			current = current.next;
			position++;
		}
		
		newEmployee.next = current.next;
		current.next = newEmployee;
		position++;
		
		System.out.println(position);
		
		//Uncomment the line below to test your code
		TestYourCode.testAddNewEmployee(position);
				
		return empList;
	}
	// ************************************ SOLUTION F3 END ************************************



	public SingleLinkedList removeAbscondedEmployee(SingleLinkedList empList) {
		// ************************************ TODO F4 ************************************
		/*
		 * This method should remove an employee from the linkedlist
		 * Note : Your task is to print the id of the employee that gets removed.
		 * This method should return the updated linkedlist
		 *
		 * Uncomment the line "TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee)" to test your code
		 * Note : this method takes abscondedEmployee ID of type integer as a parameter.
		 */
		// ************************************ SOLUTION F4 BEGIN ************************************
		int indexFromLast = 4;
		// Using two pointer approach
		Node fast = empList.head;
		Node slow = empList.head;

		for (int i = 0; i <= indexFromLast; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		int abscondedEmployee = slow.next.empObj.getId();
		System.out.println(abscondedEmployee);
		
		slow.next = slow.next.next;

		//Uncomment the line below to test your code
		TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee);
				
		return empList;
	}
	// ************************************ SOLUTION F4 END ************************************

}
