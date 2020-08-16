package com.dell.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FetchEmployeeBasedOnId {

	public static void main(String[] args) {
		Employee e1= new Employee(101,"Lakshmi",5000,"CS");
		Employee e2= new Employee(102,"Swathi",5000,"IT");
		Employee e3= new Employee(103,"Chethana",5000,"ELECTRICAL");
		Employee e4= new Employee(104,"Adishri",5000,"EC");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		System.out.println(employeeList);
		
		for(Employee emp: employeeList) {
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpSalary());
			System.out.println(emp.getEmpDept());
			System.out.println("------------");
		}
		Scanner in = new Scanner(System.in);
		System.out.println("Enter employee id :");
		int id = in.nextInt();
		
		for(Employee emp: employeeList) {
			if(emp.getEmpId() == id) {
				System.out.println(emp.getEmpName());
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpSalary());
				System.out.println(emp.getEmpDept());
				break;
			}
		}
	}

}
