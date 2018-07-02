package com.zensar.collection.map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<String,String>();
		
		//add key-value pair
		
		hm.put("SBAC001","Saving Account");
		hm.put("RDAC002","Recurring Account");
		hm.put("FDAC003","Fixed Account");
		System.out.println(hm);
		System.out.println("Value of RDAC002:="+hm.get("RDAC002"));
		
	}

}
