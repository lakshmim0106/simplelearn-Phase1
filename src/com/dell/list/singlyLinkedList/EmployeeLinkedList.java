package com.dell.list.singlyLinkedList;

public class EmployeeLinkedList {
	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee emp) {
		EmployeeNode node = new EmployeeNode(emp);
		node.setNext(head);
		head= node;
		size++;
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print("->");
			current = current.getNext();
		}
		System.out.println("null");
	}
	public Employee removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode.getEmployee();
		
	}
}
