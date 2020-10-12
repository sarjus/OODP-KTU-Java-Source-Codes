package com.sjcet.oopdemo;
class Student{
	int rollNumber;
	String name;
	String department;
	//No argument constructor
	Student(){
		this.department ="CSE";
	}
	//parameterised constructor with two argument
	Student(int rollNumber, String name){
		this.rollNumber = rollNumber;
		this.name = name;
		department = "CSE";
	}
	//parameterised constructor with three argument
	Student(int rollNumber, String name, String department){
		this.rollNumber = rollNumber;
		this.name = name;
		this.department = department;
	}
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Student student1 = new Student();
		//Calling Constructor with no arguments
		System.out.println("Student 1 details");
		System.out.println("Department : "+student1.department);
		
		Student student2 = new Student(12,"Robin Sharma");
		//calling constructor with 2 arguments
		System.out.println("Student 2 details");
		System.out.println("Roll Number : "+student2.rollNumber);
		System.out.println("Name : "+student2.name);
		
		//calling constructor with 3 arguments
		Student student3 = new Student(13,"Praveen","ME");
		System.out.println("Student 3 details");
		System.out.println("Roll Number : "+student3.rollNumber);
		System.out.println("Name = "+student3.name);
		System.out.println("Department : "+student1.department);
		System.out.println();

	}

}
