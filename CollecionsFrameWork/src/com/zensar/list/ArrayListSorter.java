package com.zensar.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorter {

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
		
		Collections.sort((List) technologiesList);
		for (String str:technologiesList) {
		System.out.println();
	}
	}	

}
