package com.springcore.datastructure.doublyLinkedList;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		MyDoublyLinkedList myList = new MyDoublyLinkedList();

		myList.insertNodeAtStart(20);
		
		myList.insertNodeAtStart(30);
		
		myList.insertNodeAtStart(40);

		myList.insertNodeAtEnd(10);

		MyDoublyNode node = (MyDoublyNode) myList.search(10);

		myList.insertNodeAfter(node, 0);
		
		myList.insertNodeAtStart(50);
		
		myList.insertNodeAtStart(60);
		
		System.out.print("Insert Data : ");
		myList.printMyList();
		
		myList.deleteFirstElement();
		
		System.out.println();
		
		myList.deleteLastElement();
		
		System.out.print("Element after delete : ");
		
		myList.printMyList();
		
		System.out.println();
		System.out.println("Iterated Element : ");
		
		for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.println(value);
			
		}

	}

}
