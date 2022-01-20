package com.sjcet.morefeatures;
interface Printable{ 
	void print();  
}  
interface Showable{ 
	void print();  
}  

public class InterfaceMultipleInheritanceDemo implements Printable,Showable {
	public void print() {
		System.out.println("I am successfully implemented Multiple Inheritance");
		
	}

	public static void main(String[] args) {
		InterfaceMultipleInheritanceDemo obj = new InterfaceMultipleInheritanceDemo();
		obj.print();

	}

}
