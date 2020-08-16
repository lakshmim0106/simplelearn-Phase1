package com.dell.list.singlyLinkedList;

public class Main {

	public static void main(String[] args) {
		Employee Lakshmi = new Employee(100, "Lakshmi", "Dev");
		Employee Pavan = new Employee(100, "Pavan", "Dev");
		Employee Karthik = new Employee(100, "Karthik", "Dev");
		Employee Srivalli = new Employee(100, "Srivalli", "Dev");
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		System.out.println(list.isEmpty());
		System.out.println(list.getSize());
		
		list.addToFront(Pavan);
		list.addToFront(Srivalli);
		list.addToFront(Karthik);
		list.addToFront(Lakshmi);
		System.out.println(list.isEmpty());
		System.out.println(list.getSize());
		
		list.printList();
		
		System.out.println("=====================");
		list.removeFromFront();
		System.out.println(list.isEmpty());
		System.out.println(list.getSize());
		
		list.printList();
	}

}
