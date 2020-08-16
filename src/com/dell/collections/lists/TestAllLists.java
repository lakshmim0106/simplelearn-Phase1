package com.dell.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestAllLists {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Lakshmi");
		nameList.add("Swathi");
		
		List<String> companyList = new ArrayList<String>();
		companyList.add("DELL");
		companyList.add("INFOSYS");
		companyList.add("HP");
		companyList.add("BOA");
		companyList.add("TCS");
		
		System.out.println("ArrayList :"+companyList);

		List<String> listOfCities = new Vector<String>();
		listOfCities.add("BENGALURU");
		listOfCities.add("BHUBANESWAR");
		listOfCities.add("PUNE");
		listOfCities.add("HYDERABAD");
		listOfCities.add("MUMBAI");
		
		System.out.println("Vector : "+ listOfCities);
		
		List<String> listOfFruits = new LinkedList<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Kiwi");
		listOfFruits.add("Watermelon");
		
		System.out.println("LinkedList :"+listOfFruits);
	}

}
