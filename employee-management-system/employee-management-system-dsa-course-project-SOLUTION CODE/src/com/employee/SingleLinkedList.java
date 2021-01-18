package com.employee;

// ************************************ TODO F1 ************************************
/*
 * Implement a Singly linkedList
 * */

public class SingleLinkedList {
	// ************************************ SOLUTION F1 BEGIN ************************************

	// declaring inner class to represent a Node of a linkedList;
	// This linkedList has data of type : PermanentEmployee with a next Node reference
	class Node {
		PermanentEmployee empObj;
		Node next;

		Node(PermanentEmployee emp) {
			empObj = emp;
			next = null;
		}
	}

	// Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	public void addNode(PermanentEmployee empObj) {
		Node newNode = new Node(empObj);

		if (head == null) {
			// If linkedlist is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode added after tail. tail's next points to newNode
			tail.next = newNode;
			// newNode is tail of the list now
			tail = newNode;
		}
	}

	public void displayLinkedList() {
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.empObj.getId() + " -> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}

	// ************************************ SOLUTION F1 END ************************************

}
