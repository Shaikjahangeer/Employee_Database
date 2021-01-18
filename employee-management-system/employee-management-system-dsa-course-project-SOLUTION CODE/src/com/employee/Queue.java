package com.employee;

// ************************************ TODO G1 ************************************
/*
 * Implement a Queue and its basic operations using LinkedList
 */

public class Queue {

	// ************************************ SOLUTION G1 BEGIN ************************************
	// A Queue Node implemented like a LinkedList Node. It has a data field and Next pointer Reference
	class QueueNode {
		int id;
		QueueNode next;

		public QueueNode(int id) {
			this.id = id;
			this.next = null;
		}
	}	

	// Declare two Nodes of Queue to be used as reference to front and rear of the
	// queue.
	QueueNode rear, front;
	int size;
	public Queue() {
		this.rear = null;
		this.front = null;
		this.size = 0;
	}

	// Implementing Enqueue Operation
	void insertInQueue(int id) {
		// Create a Queue Node to be inserted
		QueueNode temp = new QueueNode(id);
		size++;
		// if queue is empty, our queue node is first to be added. then both reference
		// also points to the same node.
		if (this.rear == null) {
			this.rear = this.front = temp;
			return;
		}
		// if queue is NOT Empty, add node to the end of queue and update the rear
		// Reference;
		this.rear.next = temp;
		this.rear = temp;
	}

	// Implementing Dequeue Operation
	void removeFromQueue() {
		// If queue is empty, cannot delete any node. Hence return null;
		if (this.front == null) {
			return;
		}
		size--;
		// moving front reference to the next node.
		QueueNode temp = this.front;
		this.front = this.front.next;

		// if Front is moved to NULL, update Rear reference as well to NULL
		if (this.front == null) {
			this.rear = null;
		}
	}
	// ************************************ SOLUTION G1 END ************************************
}
