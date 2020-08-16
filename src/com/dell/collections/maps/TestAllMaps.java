package com.dell.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestAllMaps {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<String, String>();
		phoneBook.put("Lakshmi", "9986240314");
		phoneBook.put("Pavan", "9986241214");
		phoneBook.put("Karthik", "9786240314");
		phoneBook.put("Srivalli", "9788240314");
		phoneBook.put("Vijaya", "9782340314");
		phoneBook.put("Shankar", "9796240314");
		phoneBook.put("Pavan", "9986241234");
		
		
		System.out.println(phoneBook);
		System.out.println("Lakshmi's number is :"+phoneBook.get("Lakshmi"));
		
		Set<String> allKeys = phoneBook.keySet();
		System.out.println(allKeys);
		
		for(String key: allKeys) {
			System.out.println(key + " -->  "+phoneBook.get(key));
		}
		
		Map<String, Double> listOfItems = new Hashtable<String, Double>();
		listOfItems.put("Apple", 44.7);
		listOfItems.put("Banana", 12.7);
		listOfItems.put("Grapes", 35.7);
		listOfItems.put("Orange", 30.7);
		listOfItems.put("Kiwi", 10.7);
		
		System.out.println(listOfItems);
		
		Map<Integer, String> listOfNames = new TreeMap<Integer, String>();
		listOfNames.put(101, "Lakshmi");
		listOfNames.put(111, "Pavan");
		listOfNames.put(105, "Karthik");
		listOfNames.put(103, "Srivalli");
		
		System.out.println(listOfNames);
		
		for(Map.Entry student: listOfNames.entrySet()) {
			System.out.println(student.getKey()+ "..."+ student.getValue());
		}
		
	}

}
