package com.springcore.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	private List<Object> list = new ArrayList<Object>();

	public MyStack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public void push(Object data) {
		list.add(data);
	}
	
	public Object pop() {
		if (!list.isEmpty()) {
			Object data = list.get((list.size() - 1));
			list.remove(data);
			return data;
		}else {
			throw new NullPointerException("No element found");
		}
	}
	
	public Object peek() {
		if (!list.isEmpty()) {
			return list.get((list.size() - 1));
		}else {
			throw new NullPointerException("No element found");
		}
	}
	
	public int size() {
		return list.size();
	}
}
