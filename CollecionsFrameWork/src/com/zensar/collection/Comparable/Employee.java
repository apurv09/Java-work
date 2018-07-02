package com.zensar.collection.Comparable;

public class Employee implements Comparable{
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//override compareTo()
	public int compareTo(Object otherEmployee) {
		
		if(!(otherEmployee instanceof Employee)) {
			throw new ClassCastException("Invalid object");
		}
		int age=((Employee) otherEmployee).getAge();
		
		if(this.getAge()>age)
			return 1;
		else if(this.getAge()<age)
			return -1;
		else 
			return 0;
	}
}
