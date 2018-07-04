package com.zensar.threads.synchronize;

public class Conusmer extends Thread {
	Queue queue;
	Conusmer(Queue queue){
		this.queue=queue;
		new Thread(this,"Consuer").start();	
	}
	public void run() {
		
		while(true) {
			queue.get();
	
}
}
}