package com.dell.accessModifiers;

public class Person {
	private int age= 18;
	
	protected int salary = 1000;
	// member method
	private void showAge() {
		System.out.println("Age is "+ age);
	}
	public int getAge() {
		showAge();
		return age;
	}
}
