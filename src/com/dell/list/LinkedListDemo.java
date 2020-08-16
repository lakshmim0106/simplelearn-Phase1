package com.dell.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> numberList = new LinkedList<Integer>();
		numberList.add(10);
		numberList.add(3);
		numberList.add(6);
		numberList.add(7);
		numberList.add(33);
		
		for(Integer value: numberList) {
			System.out.println(value);
		}
		for(int index=0;index< numberList.size();index++) {
			System.out.println("Element at index : "+index+"->"+numberList.get(index));
		}
	}

}
