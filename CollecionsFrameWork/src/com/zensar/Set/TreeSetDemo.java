package com.zensar.Set;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> citySet = new TreeSet<String>();
		
		//add elements to Treeset
		
		citySet.add("Bangaluru");
		citySet.add("Pune");
		citySet.add("Nashik");
		citySet.add("Pune");
		citySet.add("pune");
		System.out.println(citySet);
		Iterator itr=citySet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String city:citySet) {
			System.out.println(city);
		}
	}

	}


