package com.springcore.datastructure.queue;

import java.util.LinkedList;

public class QueueInheritLinkedList extends LinkedList<Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public void enQueue(Object data) {
		this.add(data);
	}
	
	public void deQueue() {
		if (!isEmpty()) {
			this.removeFirst();
		}else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public Object getFront() {
		if (!isEmpty()) {
			return this.getFirst();
		} else {
			return null;
		}
	}
	
	public Object getRear() {
		if (!isEmpty()) {
			return this.getLast();
		} else {
			return null;
		}
	}
	
	public int size() {
		return super.size();
	}
	
}
