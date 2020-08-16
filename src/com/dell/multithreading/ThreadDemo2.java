package com.dell.multithreading;

class WorkingThread1 extends Thread{
	public void run() {
		for(int i = 0; i< 5; i++) {
			System.out.println("WorkingThread says : Hii");
		}
	}
}
class WorkingThread2 extends Thread{
	public void run() {
		for(int i = 0; i< 5; i++) {
			System.out.println("WorkingThread2 says : Hello");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		WorkingThread1 wt1 = new WorkingThread1();
		WorkingThread2 wt2 = new WorkingThread2();
		wt1.start();
		wt2.start();
		
		
	}

}
