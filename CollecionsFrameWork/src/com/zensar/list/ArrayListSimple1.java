package com.zensar.list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSimple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> technologiesList =new ArrayList<String>();
		
		//Generic
		//add elements to ArrayList
		
		technologiesList.add("JAVA");
		technologiesList.add("C++");
		technologiesList.add("PERL");
		technologiesList.add("PHP");
		System.out.println(technologiesList);
		
//		Collections.sort((List<T>) technologiesList);
		
		System.out.println("index");
		for(int index=0;index<technologiesList.size();index++) {
			System.out.println(technologiesList.get(index));
			
		}
		
		
		for(String technology :technologiesList) {
			System.out.println(technology);
		}
		
		
		
		Iterator itr=technologiesList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
