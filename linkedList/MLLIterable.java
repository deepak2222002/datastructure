
package com.springcore.datastructure.linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MLLIterable implements Iterator<Object> {

    private MyNode current;

    public MLLIterable(MyNode current) {
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
        current = current.next;

        return data;
    }
}
