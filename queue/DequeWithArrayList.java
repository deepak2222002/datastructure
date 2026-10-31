package com.springcore.datastructure.queue;

import java.util.ArrayList;

public class DequeWithArrayList {

	public ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public void insertFront(Object data) {
		list.add(0, data);
	}

	public void insertRear(Object data) {
		list.add(data);
	}

	public void deleteFront() {
		if (!isEmpty()) {
			list.remove(0);
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public void deleteRear() {
		if (!isEmpty()) {
			list.remove(list.size() - 1);
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getFront() {
		if (!isEmpty()) {
			return list.get(0);
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getRear() {
		if (!isEmpty()) {
			return list.get(list.size() - 1);
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public int size() {
		return list.size();
	}
}
