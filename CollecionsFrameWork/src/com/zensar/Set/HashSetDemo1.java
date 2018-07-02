package com.zensar.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> citySet = new HashSet<String>();
		
		//add elements to hashset
		
		citySet.add("Bangaluru");
		citySet.add("Pune");
		citySet.add("Nashik");
		citySet.add("Pune");
		
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
