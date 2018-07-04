package com.zensar.containment;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234;
		String str1=Integer.toString(a);
		
		System.out.println("the given string is "+str1+" length is "+str1.length());
		
		String str3=String.valueOf(a);
		System.out.println(str3+" using String.valueOf(a)");
		
		Integer num=Integer.valueOf("1234587");
		System.out.println(num +"USing Integer.valueOF()");
		
		int result=num.intValue();
		
		System.out.println(result+"Using num.intValue()");
		
		float result2=num.floatValue();
		
		long longresult=num.longValue();
		
		System.out.println(result2+"Using num.floatValue()");
		
		int num2;
		num2=Integer.parseInt("255");
		
		System.out.println(num2+"Using Integer.parseInt()");
		
		String resultStr = num.toString();
		
		System.out.println(resultStr.length()+"Using num.toString()");
		
		Integer val1=new Integer(25);
		Integer val2=new Integer(24);
		
		int diff =val1.compareTo(val2);
		
		if(diff>0) {
			System.out.println(val1+"is large");
		}
			else if(diff<0) {
				System.out.println(val2+"is large");
				
			}
			else
				System.out.println("Both are equal");
		
	

	Float salary=new Float(12345.595);
	int sal=salary.intValue();
	
	System.out.println("Salary is"+salary+"Integer salary is"+sal);
	boolean salCheck=salary.isNaN();

	String hexString=Integer.toHexString(255);
	
	System.out.println("Decimal no-255\nHexadecimal string is"+hexString);
	}
}