package com.springcore.datastructure.queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		QueueInheritLinkedList queue = new QueueInheritLinkedList();
//		
//		queue.enQueue(10);
//		queue.enQueue(20);
//		queue.enQueue(30);
//		queue.enQueue(40);
//		queue.enQueue(50);
//		
//		queue.deQueue();
//		
//		System.out.println(queue.getFront());
//		
//		queue.deQueue();
//		
//		System.out.println(queue.getFront());
//		
//		System.out.println(queue.getRear());

		DequeWithCircularDoublyLinkedList queue = new DequeWithCircularDoublyLinkedList();

		queue.insertFront(10);
		queue.insertRear(20);
		queue.insertRear(30);
		queue.insertRear(40);
		queue.insertRear(50);

		queue.deleteRear();
//		
		queue.deleteFront();

		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
		System.out.println(queue.size());

	}

}
