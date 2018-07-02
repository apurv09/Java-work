package com.zensar.exception.userdefinedException;

public class Bank {
	float balance,amount;
	Bank(float balance){
		this.balance=balance;
	}
	public void withdraw(float amount) {
		this.amount=amount;
		try {
			if(this.amount>balance) {
				throw new NegativeBalanceException("Amount is more than balance");
			}
		}catch(NegativeBalanceException ngblex) {
			System.out.println(ngblex.getMessage());
		}
	}
	public void showBalance() {
		System.out.println("balance"+balance);
	}
}
