package com.springcore.datastructure.queue;

import java.util.ArrayList;

public class QueueWithArrayList {
	
	ArrayList<Object> list = new ArrayList<>();
	
	public QueueWithArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public void enQueue(Object data) {
		list.add(data);
	}
	
	public void deQueue() {
		if (!isEmpty()) {
			list.remove(0);
		}else {
			throw new NullPointerException("No Element found.");
		} 
	}
	
	public Object getFront() {
		if (!isEmpty()) {
			return list.get(0);
		}else {
			throw new NullPointerException("No Element found.");
		} 
	}
	
	public Object getRear() {
		if (!isEmpty()) {
			return list.get(list.size()-1);
		}else {
			throw new NullPointerException("No Element found.");
		} 
	}

	public int size() {
		return list.size();
	}
}
