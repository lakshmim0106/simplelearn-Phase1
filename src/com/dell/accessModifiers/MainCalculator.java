package com.dell.accessModifiers;

public class MainCalculator {

	public static void main(String[] args) {
		Integer num1 = 20;
		Integer num2 = 10;
		
		InputData data = new InputData();
		data.setNumber1(num1);
		data.setNumber2(num2);
		
		double total = 0;
		
		System.out.println("Addition of 2 numbers");
		CalculatorOperations op = new CalculatorOperations();
		total= op.add(data.getNumber1(), data.getNumber2());
		
		System.out.println("Total: "+ total);
		
		System.out.println("Subtraction of 2 numbers");
		total= op.subtract(data.getNumber1(), data.getNumber2());
		
		System.out.println("Total: "+ total);
		
		System.out.println("Multiplication of 2 numbers");
		total= op.multiply(data.getNumber1(), data.getNumber2());
		
		System.out.println("Total: "+ total);
		
		System.out.println("Division of 2 numbers");
		total= op.divide(data.getNumber1(), data.getNumber2());
		
		System.out.println("Total: "+ total);
		
	}

}
