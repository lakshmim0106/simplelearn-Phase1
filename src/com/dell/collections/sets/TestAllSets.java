package com.dell.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllSets {

	public static void main(String[] args) {
		Set<String> listOfUniqueCompanies = new HashSet<String>();
		boolean res = listOfUniqueCompanies.add("DELL");
		System.out.println(res);
		listOfUniqueCompanies.add("WIPRO");
		res = listOfUniqueCompanies.add("TCS");
		System.out.println(res);
		res= listOfUniqueCompanies.add("DELL");
		System.out.println(res);
		res =listOfUniqueCompanies.add("TCS");
		System.out.println(res);
		listOfUniqueCompanies.add("INFOSYS");
		listOfUniqueCompanies.add(null);
		
		System.out.println("HashSet :"+ listOfUniqueCompanies);
		Set<String> list2 = new LinkedHashSet<String>();
		list2.add("Hyderabad");
		list2.add("Bengaluru");
		list2.add("Pune");
		list2.add("BBSR");
		list2.add("Hyderabad");
		System.out.println("LinkedHashSet :"+ list2);
		
		
		Set<String> list3 = new TreeSet<String>();
		list3.add("Lakshmi");
		list3.add("Chethana");
		list3.add("Swathi");
		list3.add("Lakshmi");
		list3.add("Debasis");
		System.out.println("Treeset :"+ list3);
		
		
		
	}

}
