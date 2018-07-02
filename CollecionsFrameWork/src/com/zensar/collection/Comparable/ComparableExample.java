package com.zensar.collection.Comparable;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create two different Employee objects, so that we can compare the
		 */
		
		Employee one=new Employee();
		one.setAge(20);
		
		Employee two=new Employee();
		two.setAge(30);
		/*
		 * use compare to method to determine Which employee is younger
		 */
		if(one.compareTo(two)>0) {
			System.out.println("Employee one is elder than employee two!");
			
		}
		if(one.compareTo(two)<0) {
			System.out.println("Employee one is younger than employee two!");
			
		}
		if(one.compareTo(two)==0) {
			System.out.println("Both employee r same!");
			
		}
	}

}
