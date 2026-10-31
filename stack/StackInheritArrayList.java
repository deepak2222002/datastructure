package com.springcore.datastructure.stack;

import java.util.ArrayList;

public class StackInheritArrayList extends ArrayList<Object> {

	private static final long serialVersionUID = 1L;

	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void push(Object data) {
		this.add(data);
	}
	
	public Object pop() {
		if (!this.isEmpty()) {
			Object data = this.get(this.size()-1);
			this.remove(data);
			return data;
		}else {
			throw new NullPointerException("hihihih no element found");
		}
	}
	
	public Object peek() {
		if (!isEmpty()) {
			return this.get(this.size()-1);
		}else {
			throw new NullPointerException("hihihih ho element found");
		}
	}
	
	public int size() {
		return super.size();
	}

}
