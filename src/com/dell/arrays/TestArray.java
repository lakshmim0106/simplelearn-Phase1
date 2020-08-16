package com.dell.arrays;

public class TestArray {

	public static void main(String[] args) {
		
		int[] numberList = {20,15,50,30,40};
		//int numberList[];
		numberList[2]= 33;
		//System.out.println(numberList);
		for(int i = 0;i <numberList.length; i++) {
			System.out.println(numberList[i]);
		}
		System.out.println("------------------");
		double numberList2[] = {20.3,2.9,7.3};
		numberList2[1] = 'a';
		for(int i = 0;i <numberList2.length; i++) {
			System.out.println(numberList2[i]);
		}
		
		String nameList[] = {"John","Mike","David"};
		System.out.println("------------------");
		for(int i = 0;i <nameList.length; i++) {
			System.out.println(nameList[i]);
		}
	}

}
