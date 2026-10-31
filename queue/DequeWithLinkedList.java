package com.springcore.datastructure.queue;

import java.util.LinkedList;

public class DequeWithLinkedList {
	
	LinkedList<Object> list = new LinkedList<>();
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public void insertFront(Object data) {
		list.addFirst(data);
	}
	
	public void insertRear(Object data) {
		list.addLast(data);
	}
	
	public void deleteFront() {
		if (!isEmpty()) {
			list.removeFirst();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public void deleteRear() {
		if (!isEmpty()) {
			list.removeLast();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public Object getFront() {
		if (!isEmpty()) {
			return list.getFirst();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public Object getRear() {
		if (!isEmpty()) {
			return list.getLast();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public int size() {
		return list.size();
	}
}
