package com.springcore.datastructure.queue;

import java.util.ArrayList;

public class DequeInheritArrayList extends ArrayList<Object> {

	private static final long serialVersionUID = 1L;

	public boolean isEmpty() {
		return size() == 0;
	}

	public void insertFront(Object data) {
		add(0, data);
	}

	public void insertRear(Object data) {
		add(data);
	}

	public void deleteFront() {
		remove(0);
	}

	public void deleteRear() {
		remove(size() - 1);
	}

	public Object getFront() {
		if (!isEmpty()) {
			return get(0);
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getRear() {
		if (!isEmpty()) {
			return get(size() - 1);
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public int size() {
		return super.size();
	}

}
