package com.zensar.collection.Comparable.DataStructures;

import java.util.Stack;

public class StackDemo {

	//push on TOS
	static void stack_push(Stack<Integer>stack) {
		for(int value=1;value<=5;value++)
			stack.push(value);
	}
	
	//pop on TOS
	static void stack_pop(Stack<Integer>stack) {
		System.out.println("POP:");
		
		for(int value=1;value<=5;value++) {
			Integer element=(Integer) stack.pop();
			System.out.println(element);
		}
	}
	
	//Display element on TOS
	static void stack_peek(Stack<Integer>stack) {
		Integer element=(Integer) stack.peek();
		System.out.println("Element on stack top:"+element);
	}
	
	public static void main(String[] a) {
		Stack<Integer>stack=new Stack<Integer>();
		
		stack_push(stack);
		stack_peek(stack);
		stack_pop(stack);
	}
}
