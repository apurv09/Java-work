package com.zensar.threads.synchronize;

public class producer extends Thread {
	Queue queue;
	producer(Queue queue){
		this.queue=queue;
		new Thread(this,"Producer").start();
		
	}
	public void run() {
		int i=1;
		while(true) {
			queue.put(i++);
		}
	}
}
