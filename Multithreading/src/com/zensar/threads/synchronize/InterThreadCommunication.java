package com.zensar.threads.synchronize;

import com.mycompany.threads.synchronizedthreads.Producer;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Queue sharedQ=new Queue();
		
		producer prod=new producer(sharedQ);
		Conusmer conusmer=new Conusmer(sharedQ);
	}

}
