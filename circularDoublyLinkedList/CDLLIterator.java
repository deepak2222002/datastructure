package com.springcore.datastructure.circularDoublyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CDLLIterator implements Iterator<Object> {

	MyDoublyNode current;
	MyDoublyNode mainFoot;
	int count = 0;

	public CDLLIterator(MyDoublyNode current) {
		this.current = (current == null) ? null : current;
		this.mainFoot = current;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return current != null && count == 0;
	}

	@Override
	public Object next() {
		if (!hasNext()) {
			throw new NoSuchElementException("No more elements");
		}
		
		Object data = current.data;
		current = current.nextNode;
		
        if (current == mainFoot) {
            count = 1;
        }
		// TODO Auto-generated method stub
		return data;
	}

}
