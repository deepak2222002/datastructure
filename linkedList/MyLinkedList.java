package com.springcore.datastructure.linkedList;


public class MyLinkedList {

	private MyNode head;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertNodeAtStart(Object data) {
		MyNode node = new MyNode(data, head);
		head = node;
	}

	public void insertNodeAtEnd(Object data) {
		MyNode node = new MyNode(data, null);
		if (isEmpty()) {
			head = node;
			return;
		}
		MyNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public Object search(Object data) {
		MyNode temp = head;
		while (temp.next != null) {
			if (temp.data.equals(data)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public void insertNodeAfter(MyNode temp, Object data) {
		if (temp != null) {
			MyNode node = new MyNode(data, temp.next);
			temp.next = node;
			return;
		}
	}

	public void printList() {
		MyNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void deleteFirstElement() {
		if (head.next != null) {
			head = head.next;
		}
	}

	public void deleteLastElement() {
		if (head == null) {

		} else if (head.next == null) {
			head = null;
		} else {

			MyNode temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}

	}

	public void deleteItem(Object data) {

		if (head == null) {

		} else if (head.next == null) {
			if (head.data.equals(data)) {
				head = null;
			}
		} else {
			MyNode temp = head;

			if (head.data.equals(data)) {
				head = null;
			} else {
				while (temp.next != null) {
					if (temp.next.data.equals(data)) {
						temp.next = temp.next.next;
						break;
					}
					temp = temp.next;
				}
			}
		}
	}
	
	public MLLIterable iterator() {
		return new MLLIterable(head);
	}
}
