package com.dell.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Lakshmi");
		list.add("Swathi");
		list.add("Chethana");
		list.add("Adishri");
		list.add("Debasis");
		list.add("Lala");
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("--------Iterator---------");
		//Iterating a list
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------Enhanced For loop---------");
		
		//Enhanced for loop
		for(String name: list) {
			System.out.println(name);
		}
		
		System.out.println("--------for loop---------");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
