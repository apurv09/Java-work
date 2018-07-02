package com.zensar.exception.userdefinedException;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new Bank(20000.00f);
		bank.withdraw(100000.0f);
	}

}
