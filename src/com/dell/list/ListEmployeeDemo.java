package com.dell.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEmployeeDemo {

	public static void main(String[] args) {
		Employee Lakshmi = new Employee(100, "Lakshmi", "Dev");
		Employee Pavan = new Employee(100, "Pavan", "Dev");
		Employee Karthik = new Employee(100, "Karthik", "Dev");
		Employee Srivalli = new Employee(100, "Srivalli", "Dev");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(Lakshmi);
		empList.add(Pavan);
		empList.add(Karthik);
		empList.add(Srivalli);
		
		for(int index=0; index < empList.size() ;index++) {
			System.out.println("Element at index "+ index + "->"+ empList.get(index).getName());
		}
	}

}
