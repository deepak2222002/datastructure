package com.springcore.datastructure.doublyLinkedList;

public class MyDoublyLinkedList {

	MyDoublyNode head;
	
	public boolean isEmpty() {
		return head == null;
	}

	public void insertNodeAtStart(Object data) {
		MyDoublyNode temp = head;
		if (temp == null) {
			MyDoublyNode node = new MyDoublyNode(data, null, null);
			head = node;
		} else if (temp != null) {
			MyDoublyNode node = new MyDoublyNode(data, temp, null);
			temp.previousNode = node;
			head = node;
		}
	}

	public void insertNodeAtEnd(Object data) {
		MyDoublyNode temp = head;
		if (head == null) {
			insertNodeAtStart(data);
		} else if (head != null) {
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			MyDoublyNode node = new MyDoublyNode(data, null, temp);
			temp.nextNode = node;
		}
	}

	public Object search(Object data) {
		MyDoublyNode temp = head;
		if (temp == null) {
			return null;
		} else {
			while (temp.nextNode != null) {
				if (temp.data.equals(data)) {
					break;
				}
				temp = temp.nextNode;
			}
		}
		return temp;
	}

	public void insertNodeAfter(MyDoublyNode node, Object data) {
		if (node != null) {
			MyDoublyNode newNode = new MyDoublyNode(data, node.nextNode, node);
			node.nextNode = newNode;
			return;
		}
	}

	public void printMyList() {
		MyDoublyNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.nextNode;
		}
		return;
	}
	
	public void deleteFirstElement() {
		if (head != null) {
			if (head.nextNode == null) {
				head = null;
			}else {
				head = head.nextNode;
			}
		}
	}
	
	// in this function we are using backward traversing for delete last element
	
	public void deleteLastElement() {
		MyDoublyNode temp = head;
		if (head != null) {
			if (temp.nextNode == null) {
				head = null;
			}else {
				while (temp.nextNode != null) {
					temp = temp.nextNode;
				}
				
				temp = temp.previousNode;
				temp.nextNode = null;
			}
		}	
	}
	
	public MyDLLIterator iterator() {
		return new MyDLLIterator(head);
	}
	
	

}
