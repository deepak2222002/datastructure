package com.springcore.datastructure.doublyLinkedList;

public class MyDoublyNode {

	Object data;

	MyDoublyNode nextNode;

	MyDoublyNode previousNode;

	public MyDoublyNode(Object data, MyDoublyNode nextNode, MyDoublyNode previousNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
	}

}
