package com.springcore.datastructure.circularDoublyLinkedList;

public class MyDoublyNode {
	
	Object data;
	
	MyDoublyNode nextNode;
	
	MyDoublyNode previousNode;

	public MyDoublyNode(Object data, MyDoublyNode nextNode, MyDoublyNode previousNode) {
		this.data = data;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
	}
}
