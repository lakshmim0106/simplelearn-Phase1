package com.dell.multithreading;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable() {
			@Override
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
		};
		Thread t1 = new Thread(obj1);
		t1.start();
		
	}

}
