package com.zensar.collection.Comparator;

import java.util.Arrays;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[]=new Employee[3];
		//set diff attrib of individual employee
		employee[0]=new Employee();
		employee[0].setAge(40);
		employee[0].setName("Blake");
		

		employee[1]=new Employee();
		employee[1].setAge(20);
		employee[1].setName("Darwin");
		

		employee[2]=new Employee();
		employee[2].setAge(30);
		employee[2].setName("Catherina");
		
		System.out.println("order of employee before sorting is");
		
		//print array
		
		for(int i=0;i<employee.length;i++) {
			System.out.println("Employee"+(i+1)+"name::"+employee[i].getName()+"age::"+employee[i].getAge());
		}
			//sorting arry on emp age by agecomp
			Arrays.sort(employee,new AgeComparator());
			System.out.println("\n\n Order of employee after sorting by employee age is");
			for(int i1=0;i1<employee.length;i1++) {
				System.out.println("Employee"+(i1+1)+"name::"+employee[i1].getName()+"age::"+employee[i1].getAge());
			}
			
			Arrays.sort(employee,new NameComparator());
			System.out.println("\n\n Order of employee after sorting by employee NaMe is");
			for(int i1=0;i1<employee.length;i1++) {
				System.out.println("Employee"+(i1+1)+"name::"+employee[i1].getName()+"age::"+employee[i1].getAge());

		}
	}

	
}
