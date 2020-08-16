package com.dell.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int numbers[] = new int[6];
		numbers[0] = 3;
		numbers[1] = 5;
		numbers[2] = 7;
		numbers[3] = 9;
		numbers[4] = 33;
		numbers[5] = 3;
		
		//O(1)
		System.out.println("Element at index 2 -."+ numbers[2]);
		//O(n)
		for(int index = 0; index<numbers.length ;index++) {
			System.out.println("Elements at index "+ index + " -> " + numbers[index]);
		}
	}

}
