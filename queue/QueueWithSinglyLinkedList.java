package com.springcore.datastructure.queue;

public class QueueWithSinglyLinkedList {

	public QueueNode start;
	public QueueNode end;

	public int elementCount;

	public boolean isEmpty() {
		return elementCount == 0;
	}

	public void enQueue(Object data) {
		QueueNode node = new QueueNode(data, null);
		if (isEmpty()) {
			start = node;
			end = node;
		} else {
			end.nextNode = node;
			end = node;
		}
		elementCount++;
	}

	public void deQueue() {
		if (!isEmpty()) {
			if (start == end && elementCount == 1) {
				start = null;
				end = null;
			} else {
				start = start.nextNode;
			}
			elementCount--;
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getFront() {
		if (!isEmpty()) {
			return start.data;
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public Object getRear() {
		if (!isEmpty()) {
			return end.data;
		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public int size() {
		return elementCount;
	}
}

class QueueNode {

	public Object data;
	public QueueNode nextNode;

	public QueueNode(Object data, QueueNode nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}

}
