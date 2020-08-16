package com.dell.multithreading;

class Counter{
	int count;
	
	public synchronized void increaseCount() {
		count++;
	}
	
}
public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t = new Thread(()-> {
			for(int i=0;i<100;i++) {
				counter.increaseCount();
			}
		});
		Thread t1 = new Thread(()-> {
			for(int i=0;i<100;i++) {
				counter.increaseCount();
			}
		});
		Thread t2 = new Thread(()-> {
			for(int i=0;i<100;i++) {
				counter.increaseCount();
			}
		});
		t.start();
		t1.start();
		t2.start();
		t.join();
		t1.join();
		t2.join();
		System.out.println("count = "+counter.count);
	}

}
