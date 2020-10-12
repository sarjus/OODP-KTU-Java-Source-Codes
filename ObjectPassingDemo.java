package com.sjcet.oopdemo;

import java.util.Scanner;
class Students{
	String name;
	int age;
	
	Students(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void displayData() {
		System.out.println("Name : "+ this.name);
		System.out.println("Age : "+this.age);
	}
	//method to copy object reference
	public Students copyObject(Students s1) {
		name = s1.name;
		age  = s1.age;
		return s1;
	}
}

public class ObjectPassingDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	      System.out.println("Enter your name ");
	      String name = sc.next();
	      System.out.println("Enter your age ");
	      int age = sc.nextInt();
	      
	      Students student = new Students(name,age);
	      System.out.println("Contents of the original object");
	      student.displayData();
	      
	      //creating copy of the object
	      Students copyOfStd = student.copyObject(student);
	      System.out.println("Contents of the copied object");
	      copyOfStd.displayData();

	}

}
