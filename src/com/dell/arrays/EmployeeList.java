package com.dell.arrays;

import java.util.Scanner;

public class EmployeeList {
	public static void main(String[] args) {
		String names[] = {
				"Lakshmi","Pavan", "Sanjay","Karthik","Srivalli",
				"Swathi", "Chethana", "Adishri", "Rohith","Sindhu", "Lala"				
		};
		
		System.out.println("Please enter employee name");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		boolean employeePresent = false;
		int i =0;
		for(i=0;i<names.length;i++) {
			if(names[i].equalsIgnoreCase(s)){
				employeePresent = true;
				
				break;
			}
		}
		if(employeePresent) {
			System.out.println("Employee name is present");
		}else {
			System.out.println("Employee name is not present");
		}

	}
}

