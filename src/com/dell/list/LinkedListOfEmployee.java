package com.dell.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOfEmployee {

	public static void main(String[] args) {
		Employee Lakshmi = new Employee(100, "Lakshmi", "Dev");
		Employee Pavan = new Employee(100, "Pavan", "Dev");
		Employee Karthik = new Employee(100, "Karthik", "Dev");
		Employee Srivalli = new Employee(100, "Srivalli", "Dev");
		
		LinkedList<Employee> empList = new LinkedList<Employee>();
		empList.addFirst(Lakshmi);
		empList.addFirst(Pavan);
		empList.addLast(Karthik);
		empList.addFirst(Srivalli);
		System.out.print("Head :" );
		Iterator itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.println("<=>");
		}
		System.out.println("==============================");
		empList.removeFirst();
		itr = empList.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next());
				System.out.println("<=>");
			}
			System.out.println("==============================");
			empList.removeLast();
			itr = empList.iterator();
				while(itr.hasNext()) {
					System.out.print(itr.next());
					System.out.println("<=>");
				}

	}

}
