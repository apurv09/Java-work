package com.zensar.exception.solution;
import java.util.*;
public class QuotientFinder {

	int dividend,divisor,quotient;
	Scanner sc=new Scanner(System.in);
	public void readDividend() {
		System.out.println("Enter dividend");
		dividend=sc.nextInt();
	}
	public void readDivisor() {
		System.out.println("Enter Divisor");
		divisor=sc.nextInt();
	}
	
	public void getQuotient() {
		try {
			quotient=dividend/divisor;
			System.out.println("Quotient="+quotient);
		}catch(ArithmeticException aexcp) {
			System.err.println("divisor is zero..please reenter divisor");
			readDivisor();
			getQuotient();
		}
	}
	
}
