package com.dell.list.singlyLinkedList;

public class EmployeeNode {
	private Employee employee;
	private EmployeeNode next;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeNode getNext() {
		return next;
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return employee.toString();
	}
	public EmployeeNode(Employee employee, EmployeeNode next) {
		super();
		this.employee = employee;
		this.next = next;
	}
	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
		//this.next = next;
	}
	
}
