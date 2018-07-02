package com.zensar.collection.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> hm=new TreeMap<String,String>();
		
		//add key-value pair
		
		hm.put("SBAC001","Saving Account");
		hm.put("RDAC002","Recurring Account");
		hm.put("FDAC003","Fixed Account");
		System.out.println(hm);
		System.out.println("Value of SBAC001:="+hm.get("SBAC001"));
	
	}

}
