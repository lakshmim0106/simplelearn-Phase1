package com.dell.collections.queues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestAllQueue {

	public static void main(String[] args) {
		Queue<String> listOfBankUsers = new PriorityQueue<String>();
		listOfBankUsers.add("Lakshmi");
		listOfBankUsers.add("Pavan");
		listOfBankUsers.add("Srivalli");
		listOfBankUsers.add("Karthikeya");
		
		System.out.println(listOfBankUsers);
		System.out.println("Head :"+listOfBankUsers.element());
		Queue<String> list = new ArrayDeque<String>();
		list.add("Lakshmi");
		list.add("Pavan");
		list.add("Srivalli");
		list.add("Karthikeya");
		System.out.println(list);
		System.out.println(list.element());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.element());
		
		
	}

}
