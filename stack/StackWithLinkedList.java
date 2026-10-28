package com.springcore.datastructure.stack;

public class StackWithLinkedList {
	
	StackNode head;
	int elementCount;
	public StackWithLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push(Object data) {
		StackNode node = new StackNode(data, head);
		head = node;
		elementCount++;
	}
	
	public void pop() {
		if (head != null) {
			head = head.nextNode;
			elementCount--;
		}else {
			throw new NullPointerException("hihihihih no element");
		}
	}
	
	public Object peek() {
		if (head != null) {
			return head.data;
		}else {
			throw new NullPointerException("hihihihih no element");
		}
	}
	
	public Object size() {
		return elementCount;
	}
}


class StackNode {
	
	Object data;
	StackNode nextNode;
	
	public StackNode(Object data, StackNode nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
}
