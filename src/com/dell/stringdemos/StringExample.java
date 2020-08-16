package com.dell.stringdemos;

public class StringExample {

	public static void main(String[] args) {
		String name ="NOAH";
		
		String firstName = "NOAH";
		
		System.out.println("The name is :"+ name);
		
		System.out.println("The first name is :"+ firstName);
		
		//name = "Lakshmi";
		
		System.out.println("The name is :"+ name);
		
		System.out.println("The first name is :"+ firstName);
		
		if(name == firstName) {
			System.out.println("Same reference");
		} else {
			System.out.println("Different reference");
		}
		
		System.out.println("Char at index 2: " +name.charAt(2));
		System.out.println("Length : "+name.length());
		
	
		
	}

}
