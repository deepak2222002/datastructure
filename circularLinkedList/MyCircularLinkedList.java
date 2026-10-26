package com.springcore.datastructure.circularLinkedList;

import com.springcore.datastructure.doublyLinkedList.MyDLLIterator;

public class MyCircularLinkedList {

	MyNode foot;

	public MyCircularLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isEmpty() {
		return foot == null;
	}

	public void insertNodeAtStart(Object data) {
		if (foot == null) {
			MyNode node = new MyNode(data, foot);
			node.nextNode = node;
			foot = node;
		} else {
			MyNode node = new MyNode(data, foot.nextNode);
			foot.nextNode = node;
		}
	}

	public void insertNodeAtLast(Object data) {
		if (foot == null) {
			insertNodeAtStart(data);
		} else {
			MyNode node = new MyNode(data, foot.nextNode);
			foot.nextNode = node;
			foot = node;
		}
	}

	public MyNode search(Object data) {
		if (foot != null) {
			MyNode temp = foot.nextNode;
			while (temp.nextNode != foot) {
				if (temp.data.equals(data)) {
					return temp;
				}
				temp = temp.nextNode;
			}
			if (temp.data.equals(data)) {
				return temp;
			}
		}
		return null;
	}

	public void insertNodeAfter(MyNode node, Object data) {
		if (foot != null) {
			MyNode temp = foot.nextNode;

			while (!temp.equals(foot)) {
				if (temp.equals(node)) {
					MyNode newNode = new MyNode(data, temp.nextNode);
					temp.nextNode = newNode;
					break;
				}
				temp = temp.nextNode;
			}

		}
	}

	public void printMylist() {
		if (foot != null) {
			MyNode temp = foot.nextNode;
			while (temp != foot) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
			System.out.println(temp.data + " ");
		}
	}

	public void deleteFirstElement() {
		if (foot != null) {
			if (foot.nextNode.equals(foot)) {
				foot.nextNode = null;
				foot = null;
			} else {
				MyNode temp = foot.nextNode;
				foot.nextNode = temp.nextNode;
			}
		}
	}

	public void deleteLastElement() {
		if (foot == null) {
			return;
		}
		if (foot.nextNode == foot) {
			foot = null;
			return;
		}
		MyNode temp = foot.nextNode;
		while (temp.nextNode != foot) {
			temp = temp.nextNode;
		}
		temp.nextNode = foot.nextNode;
		foot = temp;
	}
	
	public void deleteElement(Object data) {
	    if (foot == null) {
	        return;
	    }
	    
	    if (foot.nextNode.data.equals(data)) {
	        foot.nextNode = foot.nextNode.nextNode;
	    }
	    
	    MyNode temp = foot.nextNode;
	    while (temp != foot) {
	        if (temp.nextNode.data.equals(data)) {
	            if (temp.nextNode == foot) {
	                temp.nextNode = foot.nextNode;
	                foot = temp;
	            } else {
	                temp.nextNode = temp.nextNode.nextNode;
	            }
	            return;
	        }
	        temp = temp.nextNode;
	        
	    }
	}
	
	public int size() {
		int size = 0;
		if (foot == null) {
			return 0;
		}
		MyNode temp = foot.nextNode;
		while (temp != foot) {
			temp = temp.nextNode;
			size = size + 1;
		}
		size = size + 1;
		return size;
	}
	
	public CLLIterator iterator() {
		return new CLLIterator(foot);
	}
}
