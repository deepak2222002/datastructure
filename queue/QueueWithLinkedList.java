package com.springcore.datastructure.queue;

import java.util.LinkedList;

public class QueueWithLinkedList {

	public LinkedList<Object> list = new LinkedList<>();

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public void enQueue(Object data) {
		list.add(data);
	}

	public void deQueue() {
		if (!list.isEmpty()) {
			list.remove(0);
		}else {
			throw new NullPointerException("No Element found");
		}
	}

	public Object getFront() {
		if (!isEmpty()) {
			return list.getFirst();
		}else {
			return null;
		}
	}
	
	public Object getRear() {
		if (!isEmpty()) {
			return list.getLast();
		} else {
			return null;
		}
	}
}
