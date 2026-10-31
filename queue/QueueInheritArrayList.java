package com.springcore.datastructure.queue;

import java.util.ArrayList;

public class QueueInheritArrayList extends ArrayList<Object> {

	private static final long serialVersionUID = 1L;
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void enQueue(Object data) {
		this.add(data);
	}
	
	public void deQueue() {
		if (!isEmpty()) {
			this.remove(0);
		}else {
			throw new NullPointerException("No Element found");
		}
	}
	
	public Object getFront() {
		if (!isEmpty()) {
			return this.get(0);
		}else {
			throw new NullPointerException("No Element found");
		}
	}
	
	public Object getRear() {
		if (!isEmpty()) {
			return this.get(this.size()-1);
		}else {
			throw new NullPointerException("No Element found");
		}
	}
	
	public int size() {
		return super.size();
	}

}
