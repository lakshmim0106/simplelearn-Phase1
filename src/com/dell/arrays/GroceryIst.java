package com.dell.arrays;

import java.util.Scanner;

public class GroceryIst {
	public static void main(String[] args) {
		String groceries[] = {
				"Corn Flakes","Pulses", "Wheat flour","Salt","Oil",
				"Mustard seeds", "Shampoo", "Surf", "Cream","Soap", "Rice"				
		};
		
		System.out.println("Welcome to Grocery store");
		System.out.println("Please enter product name");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		boolean groceryPresent = false;
		int i =0;
		for(i=0;i<groceries.length;i++) {
			if(groceries[i].equalsIgnoreCase(s)){
				groceryPresent = true;
				
				break;
			}
		}
		if(groceryPresent) {
			System.out.println("Your product is in grocery list");
		}else {
			System.out.println("Please buy from that grocery story");
		}

	}
}

