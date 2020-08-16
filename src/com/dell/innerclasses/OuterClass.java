package com.dell.innerclasses;

public class OuterClass {

	public String data="Secure Data";
	private Double price = 1200.50;
	
	class InnerClass{
		public void showData() {
			System.out.println("Data :"+data);
		}
		public void showPrice() {
			System.out.println("Price :"+ price);
		}
	}

}

