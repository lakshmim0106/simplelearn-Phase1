package com.dell.typecasting;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of apples ");
		
		int userNumber = input.nextInt();
		
		System.out.println("User input as integer : "+ userNumber);
		
		float userFloat = userNumber;
		
		byte userByte = (byte)userNumber;
				
		double userDouble = userNumber;
		
		System.out.println("Float :"+ userFloat);
		
		System.out.println("Byte :"+ userByte);
		
		System.out.println("Double :"+ userDouble);
	}
}
