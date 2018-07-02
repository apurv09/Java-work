package com.zensar.collection.Comparator;

import java.util.Comparator;
public class AgeComparator implements Comparator{

	public int compare(Object emp1,Object emp2) {
		/*
		 * parameter are of type object so we have to downcast it
		 * to employee objects
		 */
		int emp1Age=((Employee)emp1).getAge();
		int emp2Age=((Employee)emp2).getAge();
		
		if (emp1Age>emp2Age)
			return 1;
		else 	if (emp1Age<emp2Age)
			return -1;
		else 
			return 0;
	}
}
