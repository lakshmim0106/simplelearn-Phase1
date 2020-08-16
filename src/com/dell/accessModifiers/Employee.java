package com.dell.accessModifiers;

public class Employee {
	private int empId= 101;
	public String empName= "Lakshmi";
	protected double empSalary= 10000;
	
	public void getId() {
		System.out.println("Employee id: "+ empId);
	}
	public void getEmpName() {
		System.out.println("Employee name: "+ empName);
	}
	public void showSalar() {
		System.out.println("EMployee salary :"+ empSalary);
	}
}
