package com.springcore.datastructure.queue;


public class DequeWithCircularDoublyLinkedList {

	public DequeNode head;

	public int elementCount;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFront(Object data) {
		if (!isEmpty()) {
			DequeNode node = new DequeNode(data, null, null);

			if (head.nextNode.equals(head)) {
				node.nextNode = head.nextNode;
				node.previousNode = head.previousNode;

				head.nextNode = node;
				head.previousNode = node;

				head = node;
			} else {
				node.nextNode = head;
				node.previousNode = head.previousNode;

				head.previousNode = node;

				head = node;
			}

		} else {
			DequeNode node = new DequeNode(data, null, null);
			node.nextNode = node;
			node.previousNode = node;
			head = node;
		}

		elementCount++;
	}

	public void insertRear(Object data) {
		if (!isEmpty()) {
			DequeNode node = new DequeNode(data, null, null);
			
			if (head.nextNode.equals(head)) {
				node.nextNode = head.nextNode;
				node.previousNode = head.previousNode;

				head.nextNode = node;
				head.previousNode = node;

			} else {
				node.nextNode = head;
				node.previousNode = head.previousNode;

				head.previousNode.nextNode = node;
				head.previousNode = node;

			}

		} else {
			DequeNode node = new DequeNode(data, null, null);
			node.nextNode = node;
			node.previousNode = node;
			head = node;

		}

		elementCount++;
	}

	public void deleteFront() {
		if (!isEmpty()) {
			if (head.nextNode.equals(head)) {
				head.nextNode=null;
				head.previousNode=null;
				head = null;
				
			} else if (head.nextNode.nextNode.equals(head)) {
				
				head.nextNode.nextNode = head.nextNode;
				head.previousNode.previousNode = head.previousNode;

				head = head.nextNode;
				
			} else {
				head.nextNode.previousNode = head.previousNode;
				head.previousNode.nextNode = head.nextNode;

				head = head.nextNode;
				
			}
			elementCount--;

		} else {
			throw new NullPointerException("No Element Found");
		}
	}

	public void deleteRear() {
		if (!isEmpty()) {
			if (head.nextNode.equals(head)) {
				head.nextNode = null;
				head.previousNode = null;
				
				head = null;
			}else if(head.nextNode.nextNode.equals(head)) {
				
				head.nextNode.nextNode = null;
				head.nextNode.previousNode = null;
				
				head.nextNode = head;
				head.previousNode = head;
				
			} else {
				
				head.previousNode.nextNode = head;
				head.previousNode = head.previousNode.previousNode;
				
			}
			elementCount--;
		} else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public Object getFront() {
		if (!isEmpty()) {
			return head.data;
		}else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public Object getRear() {
		if (!isEmpty()) {
			return head.previousNode.data;
		}else {
			throw new NullPointerException("No Element Found");
		}
	}
	
	public int size() {
		return elementCount;
	}
}

class DequeNode {

	public Object data;

	public DequeNode nextNode;

	public DequeNode previousNode;

	public DequeNode(Object data, DequeNode nextNode, DequeNode previousNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
	}

}
