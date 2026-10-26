package com.springcore.datastructure.doublyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyDLLIterator implements Iterator<Object> {
	
	MyDoublyNode current;
	
    public MyDLLIterator(MyDoublyNode current) {
		this.current = current;
	}

	@Override
    public boolean hasNext() {
        return current != null;
    }

	@Override
	public Object next() {
		 if (!hasNext()) {
	            throw new NoSuchElementException("No more elements");
	        }
		 
		 Object data = current.data;
		 current= current.nextNode;
		// TODO Auto-generated method stub
		return data;
	}

}
