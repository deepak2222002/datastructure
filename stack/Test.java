package com.springcore.datastructure.stack;

public class Test {
	
	public static void main(String[] args) {
		
//		MyStack stack = new MyStack();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		
//		System.out.println("Removing Element : " + stack.pop());
//		
//		System.out.println(stack.peek());
		
		StackInheritSLL myList = new StackInheritSLL();
//		myList.push(10);
//		myList.push(20);
//		myList.push(30);
//		myList.push(40);
		
		myList.pop();
		
		System.out.println(myList.peek());
		
		System.out.println(myList.size());
	}

}
