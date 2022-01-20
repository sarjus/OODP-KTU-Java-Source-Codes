package com.sjcet.oopdemo;
class Animals {
	   protected String type;
	   private String color;
	   public void eat() {
	      System.out.println("I can eat");
	   }
	   public void sleep() {
	      System.out.println("I can sleep");
	   }
	   public String getColor(){
	      return color;
	   }
	   public void setColor(String col){
	      color = col;
	   }
	}

	class Dogs extends Animals {
	   public void displayInfo(String c){
	      System.out.println("I am a " + type);
	      System.out.println("My color is " + c);
	   }
	   public void bark() {
	      System.out.println("I can bark");
	   }
	}

public class ProtectedDemo {
	public static void main(String[] args) {

	      Dogs dog1 = new Dogs();
	      dog1.eat();
	      dog1.sleep();
	      dog1.bark();
	 
	      dog1.type = "mammal";
	     
	      dog1.setColor("black");
	      dog1.displayInfo(dog1.getColor()); 
	   }

}
