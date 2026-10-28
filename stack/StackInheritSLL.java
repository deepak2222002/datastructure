package com.springcore.datastructure.stack;

import com.springcore.datastructure.linkedList.MyLinkedList;

public class StackInheritSLL extends MyLinkedList {
	
	public int elementCount;
	
	public StackInheritSLL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public void push(Object data) {
		insertNodeAtStart(data);
		elementCount++;
	}
	
	public void pop() {
		if (head != null) {
			deleteFirstElement();
			elementCount--;
		}else {
			throw new NullPointerException("No Element found");
		}
		
	}
	
	public Object peek() {
		if (head != null) {
			return head.data;
		}else {
			throw new NullPointerException("No Element found");
		}
	}
	
	public Object size() {
		return elementCount;
	}
	

}
