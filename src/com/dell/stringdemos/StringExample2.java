package com.dell.stringdemos;

public class StringExample2 {

	public static void main(String[] args) {
		String name = new String("NOAH");
		
		String firstName = new String("NOAH");
		
		System.out.println("The name is: "+ name);
		
		System.out.println("The first name is: "+ firstName);
		
		if(name == firstName) {
			System.out.println("Same reference");
		} else {
			System.out.println("Different reference");
		}
		
	}

}
