package com.sjcet.oopdemo;
//Java program to demonstrate one object to 
//initialize another 
class Box6{ 
 double width, height, depth; 
 // Notice this constructor. It takes an 
 // object of type Box. This constructor use 
 // one object to initialize another 
 Box6(Box6 ob){ 
     width = ob.width; 
     height = ob.height; 
     depth = ob.depth; 
 } 
 // constructor used when all dimensions 
 // specified 
 Box6(double w, double h, double d){ 
     width = w; 
     height = h; 
     depth = d; 
 } 
 // compute and return volume 
 double volume(){ 
     return width * height * depth; 
 } 
} 
public class ObjectPassingConstructorDemo {
	public static void main(String args[])     { 
        // creating a box with all dimensions specified 
        Box6 mybox = new Box6(10, 20, 15); 
  
        //  creating a copy of mybox 
        Box6 myclone = new Box6(mybox);
        //Box6 myclone = mybox;
        
        myclone.width = 30;
        mybox.height = 40;
        myclone.depth = 50;
        double vol; 
  
        // get volume of mybox 
        vol = mybox.volume(); 
        System.out.println("Volume of mybox is " + vol); 
  
        // get volume of myclone 
        vol = myclone.volume(); 
        System.out.println("Volume of myclone is " + vol); 
    } 

}
