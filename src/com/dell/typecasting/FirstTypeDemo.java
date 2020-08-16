package com.dell.typecasting;

public class FirstTypeDemo {
	public static void main(String[] args) {
		// Widening or automatic conversion or Implicit Typecasting
		
		int count = 100;
		
		long countBig = count;
		
		float countFp = countBig;
		
		double countDecimal = countFp;
				
		System.out.println("Int Value :"+ count);
		
		System.out.println("Long value: " + countBig);
		
		System.out.println("Float value: " + countFp);
		System.out.println("Double value: " + countDecimal);
	}

}
