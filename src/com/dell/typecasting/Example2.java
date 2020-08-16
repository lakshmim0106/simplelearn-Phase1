package com.dell.typecasting;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		String userInput = input.nextLine();
		
		byte userByte = Byte.parseByte(userInput);
		
		float userFloat = Float.parseFloat(userInput);
		
		double userDouble  = Double.parseDouble(userInput);
		
		System.out.println("USerInput: "+ userInput);
		
		System.out.println("UserByte : " + userByte);
		
		System.out.println(" UserFloat :"+ userFloat);
		
		System.out.println("User Double : "+ userDouble);
		
	}
}
