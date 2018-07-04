package com.zensar.strings;
public class StringBuilderDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Append string
/*		
		StringBuilder sbldr1=new StringBuilder("Hello");
		sbldr1.append("Java");// here original string will get change
		System.out.println(sbldr1);
	
		//2.Insering string
		StringBuilder sbldr2=new StringBuilder("HEllo");
		sbldr2.insert(1,"Java");
		System.out.println(sbldr2);
		System.out.println(sbldr2.charAt(4));
	
		//3Replacing String
		StringBuilder sbldr3=new StringBuilder("HEllo");
		sbldr3.replace(1,3,"Java");
		System.out.println(sbldr3);
		
		
		// 4.Deleting String

		StringBuilder sbldr4=new StringBuilder("HEllo");
		sbldr4.delete(1,3);
		System.out.println(sbldr4);
		
		// 5.Reversing String
		StringBuilder sbldr5=new StringBuilder("HEllo");
		StringBuilder sbldr5rev=sbldr5.reverse();
		
		//sbldr5.reverse();
		sbldr5.reverse();
		System.out.println(sbldr5.equals(sbldr5rev));
		System.out.println(sbldr5);
		
		
		String str="Welcome to Java";
		String spltStr[]=str.split(" ");
		System.out.println(spltStr.length);
		for(String tempStr : spltStr)
			System.out.println((tempStr));
	*/
		StringBuilder firstStrbldr= new StringBuilder("RATSDROWNINWORDSTAR");
		StringBuilder dupStrbldr= new StringBuilder(firstStrbldr);
		firstStrbldr.reverse();
		System.out.println(firstStrbldr);
		if(firstStrbldr.toString().equals(dupStrbldr.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		}

}
