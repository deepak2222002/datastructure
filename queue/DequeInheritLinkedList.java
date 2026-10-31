package com.springcore.datastructure.queue;

import java.util.LinkedList;

public class DequeInheritLinkedList extends LinkedList<Object> {

	private static final long serialVersionUID = 1L;

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public void insertFront(Object data) {
		addFirst(data);
	}

	public void insertRear(Object data) {
		addLast(data);
	}

	public void deleteFront() {
		if (!isEmpty()) {
			removeFirst();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public void deleteRear() {
		if (!isEmpty()) {
			removeLast();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getFront() {
		if (!isEmpty()) {
			return getFirst();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getRear() {
		if (!isEmpty()) {
			return getLast();
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public int size() {
		return super.size();
	}

}
