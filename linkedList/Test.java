package com.springcore.datastructure.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Test {

	public static void main(String[] args) {

		MyLinkedList myList = new MyLinkedList();
		myList.insertNodeAtStart(20);
		myList.insertNodeAtStart(30);
		myList.insertNodeAtEnd(40);
		myList.insertNodeAfter((MyNode) myList.search(20), 50);
		System.out.print("Inserted Element : ");
		myList.printList();
		System.out.println();
		System.out.print("Iterator Element : ");
		for (MLLIterable iterator = myList.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + " ");

		}

	}
}
