package com.sjcet.morefeatures;
interface Bank{
	float rateOfInterest();  
}  
class SBI implements Bank{  
	public float rateOfInterest(){
		return 9.15f;
	}  
}  
class PNB implements Bank{  
	public float rateOfInterest(){
		return 9.7f;
	}  
}  
public class InterfaceDemo {
	public static void main(String[] args) {
		Bank sbi=new SBI();  
		System.out.println("SBI ROI: "+sbi.rateOfInterest());  
		Bank pnb = new PNB();
		System.out.println("PNB ROI: "+pnb.rateOfInterest()); 
		
	 }
}
