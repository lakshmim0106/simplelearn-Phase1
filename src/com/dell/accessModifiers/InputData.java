package com.dell.accessModifiers;

public class InputData {
	private double total;
	private int number1;
	private int number2;
	
	public InputData() {
		
	}
	public InputData(double total, int number1, int number2) {
		super();
		this.total = total;
		this.number1 = number1;
		this.number2 = number2;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	
}
