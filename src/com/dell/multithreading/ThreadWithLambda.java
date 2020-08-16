package com.dell.multithreading;

public class ThreadWithLambda {

	public static void main(String[] args) {
		Runnable obj1 = ()  ->{
				for(int i = 0; i< 5; i++) {
					System.out.println("WorkingThread says : Hii");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		};
		Runnable obj2 = ()  ->{
			for(int i = 0; i< 5; i++) {
				System.out.println("WorkingThread says : Hello");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(obj1);
		t1.start();

		Thread t2 = new Thread(obj2);
		t2.start();
	}

}
