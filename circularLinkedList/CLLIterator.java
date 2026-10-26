package com.springcore.datastructure.circularLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CLLIterator implements Iterator<Object> {

    MyNode current;
    MyNode mainFoot;
    int count = 0;

    public CLLIterator(MyNode foot) {
        this.current = (foot == null) ? null : foot.nextNode;
        this.mainFoot = this.current;
    }

    @Override
    public boolean hasNext() {
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

        return data;
    }
}