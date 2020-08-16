package com.dell.multithreading;

public class ThreadWithLambda2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(()  ->{
				for(int i = 0; i< 5; i++) {
					System.out.println("WorkingThread says : Hii");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		});
		Thread t2 = new Thread(()  ->{
			for(int i = 0; i< 5; i++) {
				System.out.println("WorkingThread says : Hello");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

}
