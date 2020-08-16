package com.dell.typecasting;

public class ExplicitTypeCast {
	public static void main(String[] args) {
		// Explicit type cast or narrowing
		// Double  -> float -> long -> int -> short -> byte
		
		double price = 100.49;
		
		long priceBig = (long) price;
		
		int priceInt = (int) priceBig;
		
		byte priceByte = (byte) priceInt;
		
		System.out.println("Double price: "+ price);
		System.out.println("Long price: "+ priceBig);
		System.out.println("int price: "+ priceInt);
		System.out.println("byte price: "+ priceByte);
	}
}
