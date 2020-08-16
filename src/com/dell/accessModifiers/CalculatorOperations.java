package com.dell.accessModifiers;

public class CalculatorOperations {
	public double add(Integer number1, Integer number2) {
		if ( number1 == null || number1 <= 0 ) {
			System.out.println("Not allowed");
			return -1;
		}else {
			return number1 + number2;
		}
	}
	public double subtract(Integer number1, Integer number2) {
		if ( number1 == null || number1 <= 0 ) {
			System.out.println("Not allowed");
			return -1;
		}else {
			return number1 - number2;
		}
	}
	public double multiply(Integer number1, Integer number2) {
		if ( number1 == null || number1 <= 0 ) {
			System.out.println("Not allowed");
			return -1;
		}else {
			return number1 * number2;
		}
	}
	public double divide(Integer number1, Integer number2) {
		if ( number1 == null || number1 <= 0 ) {
			System.out.println("Not allowed");
			return -1;
		}else {
			return number1 / number2;
		}
	}
}
