package com.dell.collections.lists;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int studentId;
	private String firstName;
	private String lastName;
	private int marks;
	private String address;
	
	public Student() {
		
	}
	public Student(int studentId, String firstName, String lastName, int marks, String address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", marks="
				+ marks + ", address=" + address + "]";
	}
}
public class StudentList {

	public static void main(String[] args) {
		Student student1 = new Student(101,"Lakshmi","Prasanna", 98,"Bengaluru");
		Student student2 = new Student(102,"Swathi","Upadhya", 99,"Udipi");
		Student student3 = new Student(103,"Debasis","Behera", 90,"Marathahalli");
		Student student4 = new Student(104,"Adishri","Gupta", 80,"Jaipur");
		Student student5 = new Student(105,"Chethana","PC", 95,"Mangalore");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println(studentList);
	}

}
