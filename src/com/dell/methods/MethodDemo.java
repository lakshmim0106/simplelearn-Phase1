package com.dell.methods;

import com.dell.accessModifiers.Person;

public class MethodDemo {
	
	public void showMessage() {
		System.out.println(".....-------.......");
		System.out.println("Welcome to methods");
		System.out.println(".....-------.......");
	}
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.showMessage();
		
		Person p = new Person();
		p.getAge();
	}
}
