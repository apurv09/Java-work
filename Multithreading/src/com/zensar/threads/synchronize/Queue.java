package com.zensar.threads.synchronize;

public class Queue {

	int n;
	boolean valueSet=false;
	
	public synchronized void put(int n) {
		if(valueSet)
		try{
			wait();
		}catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		this.n=n;
		valueSet=true;
		if(n<=5)
			System.out.println("Producer Manufactured product:"+n);
		else System.exit(0);
		
		notify();
	}
	
	public synchronized int get() {
		if(!valueSet)
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		if(n<=5)
			System.out.println("Conusmer purchased product:"+n);
		else System.exit(0);
		
		valueSet=false;
		notify();
		return n;
	}
}
