package com.zensar.collection.Comparable.DataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pQueue=new PriorityQueue<String>();
		
		//Adding items to pque
		pQueue.add("C");
		pQueue.add("C++");
		pQueue.add("Java");
		pQueue.add("Python");
	

		//printing the most priority element
		System.out.println("Head value using geek function:"+pQueue.peek());
		
		//printing all element
		System.out.println("The queue elements:");
		Iterator itr=pQueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}	
			
			
			
		pQueue.poll();	
		System.out.println("After removing an element"+"with poll function");
		Iterator<String>itr2=pQueue.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		//check if an element ia present
		boolean b=pQueue.contains("C");
		System.out.println("Priority queue conatins C "+"or not:"+b);
		
	}
	

}
