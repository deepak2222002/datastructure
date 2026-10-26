package com.springcore.datastructure.circularDoublyLinkedList;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		MyCircularDoublyLinkedList myList = new MyCircularDoublyLinkedList();
		myList.insertNodeAtLast(50);
		myList.insertNodeAtStart(40);
		myList.insertNodeAtStart(30);
		myList.insertNodeAtStart(20);

		myList.insertNodeAtLast(60);

		myList.printMyList();

		MyDoublyNode node = myList.search(60);

		myList.insertNodeAfter(node, 70);

		myList.insertNodeAtStart(10);

		myList.insertNodeAtLast(80);

		System.out.println();

		myList.printMyList();

//		myList.deleteFirstElement();

		System.out.println();

		myList.printMyList();
		
//		myList.deleteLastElement();s

		System.out.println();

		myList.printMyList();
		
		myList.deleteElement(10);
		
		myList.deleteElement(80);
		
		myList.deleteElement(20);

		System.out.println();

		myList.printMyList();
		
		System.out.println();
		
		for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.print(value + " ");
			
		}

	}

}
