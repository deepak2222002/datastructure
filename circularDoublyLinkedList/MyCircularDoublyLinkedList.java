package com.springcore.datastructure.circularDoublyLinkedList;

import javax.sound.midi.Soundbank;

import org.springframework.util.ReflectionUtils;

public class MyCircularDoublyLinkedList {

	MyDoublyNode head;

	public MyCircularDoublyLinkedList() {

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertNodeAtStart(Object data) {
		if (head == null) {
			MyDoublyNode node = new MyDoublyNode(data, null, null);
			head = node;
			node.nextNode = head;
			node.previousNode = head;
			return;
		}

		if (head.nextNode.equals(head)) {
			MyDoublyNode node = new MyDoublyNode(data, null, null);

			head.previousNode = node;
			head.nextNode = node;

			node.nextNode = head;
			node.previousNode = head;

			head = node;
			return;
		}

		MyDoublyNode node = new MyDoublyNode(data, null, null);

		node.nextNode = head.previousNode.nextNode;
		node.previousNode = head.previousNode;

		head.previousNode.nextNode = node;
		head.previousNode = node;

		head = node;
		return;
	}

	public void insertNodeAtLast(Object data) {
		if (head == null) {
			insertNodeAtStart(data);
			return;
		}

		if (head.nextNode.equals(head)) {
			MyDoublyNode node = new MyDoublyNode(data, null, null);

			head.previousNode = node;
			head.nextNode = node;

			node.nextNode = head;
			node.previousNode = head;
			return;

		}
		if (head.previousNode.nextNode.equals(head)) {
			MyDoublyNode node = new MyDoublyNode(data, null, null);

			node.nextNode = head.previousNode.nextNode;
			node.previousNode = head.previousNode;

			head.previousNode.nextNode = node;
			head.previousNode = node;
			return;

		}

	}

	public MyDoublyNode search(Object data) {
		if (head != null) {
			MyDoublyNode temp = head.nextNode;

			if (temp.data.equals(data)) {
				return temp;
			}
			while (temp != head) {
				if (temp.nextNode.data.equals(data)) {
					return temp.nextNode;
				}
				temp = temp.nextNode;
			}
		}
		return null;
	}

	public void insertNodeAfter(MyDoublyNode node, Object data) {
		if (head == null) {
			return;
		}

		if (head.nextNode.equals(head)) {
			if (head.equals(node)) {
				insertNodeAtLast(data);
			}
			return;
		}

		if (!head.nextNode.equals(head)) {
			MyDoublyNode temp = head;
			while (temp.nextNode != head) {
				if (temp.equals(node)) {
					MyDoublyNode newNode = new MyDoublyNode(data, null, null);
					newNode.previousNode = temp;
					newNode.nextNode = temp.nextNode;

					temp.nextNode.previousNode = newNode;
					temp.nextNode = newNode;
					return;
				}
				temp = temp.nextNode;
			}

			if (temp.equals(node)) {
				MyDoublyNode newNode = new MyDoublyNode(data, null, null);
				newNode.previousNode = temp;
				newNode.nextNode = temp.nextNode;

				temp.nextNode.previousNode = newNode;
				temp.nextNode = newNode;
				return;
			}
		}
	}

	public void printMyList() {
		if (head != null) {
			MyDoublyNode temp = head.nextNode;
			System.out.print(head.data + " ");
			while (temp != head) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
		}
	}

	public void deleteFirstElement() {
		if (head != null) {
			if (head.nextNode.equals(head)) {
				head = null;
				return;
			}

			if (!head.nextNode.equals(head)) {
				head.nextNode.previousNode = head.previousNode;
				head.previousNode.nextNode = head.nextNode;

				head = head.nextNode;
				return;
			}
		}
	}

	public void deleteLastElement() {
		if (head != null) {
			if (head.nextNode.equals(head)) {
				head = null;
				return;
			}

			if (!head.nextNode.equals(head)) {
				head.previousNode.previousNode.nextNode = head;
				head.previousNode = head.previousNode.previousNode;
				return;
			}
		}
	}

	public void deleteElement(Object data) {
		if (head != null) {
			if (head.nextNode.equals(head)) {
				if (head.data.equals(data)) {
					deleteFirstElement();
					return;
				}
			}
			if (!head.nextNode.equals(head)) {
				MyDoublyNode temp = head;

				if (temp.data.equals(data)) {
					deleteFirstElement();
					return;
				}

				while (temp.nextNode != head) {
					if (temp.nextNode.data.equals(data)) {
						temp.nextNode.nextNode.previousNode = temp;
						temp.nextNode = temp.nextNode.nextNode;
						return;
					}
					temp = temp.nextNode;
				}
			}
		}
	}
	
	public CDLLIterator iterator() {
		return new CDLLIterator(head);
	}

}
