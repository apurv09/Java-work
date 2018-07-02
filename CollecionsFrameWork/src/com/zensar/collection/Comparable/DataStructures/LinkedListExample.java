package com.zensar.collection.Comparable.DataStructures;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cityLinkedList=new LinkedList<String>();
		//add elemnt to LL
		cityLinkedList.add("Banglore");
		cityLinkedList.add("NAshik");
		
		cityLinkedList.addLast("Hyderabad");
		cityLinkedList.addLast("Pune");
		cityLinkedList.addLast("Mumbai");
		
		System.out.println("LinkedList:"+cityLinkedList);
		
		//remove element from LL
		cityLinkedList.remove("Pune");
		cityLinkedList.remove(3);
		cityLinkedList.removeFirst();
		cityLinkedList.removeLast();
		System.out.println("LinkedList:"+cityLinkedList);
		
		
	}

}
