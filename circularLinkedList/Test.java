package com.springcore.datastructure.circularLinkedList;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyCircularLinkedList myList = new MyCircularLinkedList();
			
			myList.insertNodeAtStart(30);
			
			myList.insertNodeAtStart(20);
			
			myList.insertNodeAtStart(10);
			
			myList.insertNodeAtStart(5);
			
			myList.insertNodeAtLast(40);
			
			myList.insertNodeAtLast(50);
			
			myList.insertNodeAfter(myList.search(5), 8);
			
			myList.insertNodeAfter(myList.search(10), 15);
//			
			myList.printMylist();
//			
//			
			myList.deleteFirstElement();
			myList.deleteFirstElement();
//			
			myList.deleteLastElement();
//			myList.deleteLastElement();
//			myList.deleteLastElement();
//			myList.deleteLastElement();
//			myList.deleteLastElement();
//			myList.deleteLastElement();
//			myList.deleteLastElement();
//			myList.deleteLastElement();
			
//			myList.deleteElement(10);
			
			myList.printMylist();
			System.out.println("Length : "  + myList.size());
			
			for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
				Integer value = (Integer) iterator.next();
				System.out.print(value + " ");
				
			}
			
//			myList.deleteFirstElement();
			
			

		

	}

}
