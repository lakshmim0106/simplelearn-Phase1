package com.dell.multithreading;

class Ramu implements Runnable{
	public void run() {
		for(int i = 0; i< 5; i++) {
			System.out.println("WorkingThread says : Hii");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Shamu implements Runnable{
	public void run() {
		for(int i = 0; i< 5; i++) {
			System.out.println("WorkingThread2 says : Hello");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) throws InterruptedException {
		Ramu wt1 = new Ramu();
		Shamu wt2 = new Shamu();
		Thread t1 = new Thread(wt1);
		Thread t2 = new Thread(wt2);
		t2.start();
		t1.start();
		
		t1.join();
		t2.join();
		System.out.println("Main thread");
		
	}

}
