/**
 * @author Sarju S
 * Date: 08/04/2020
 * Description: Generate 100 Odd and Even Numbers.
 */
package com.sjcet.additionalfeatures;
class OddNumbers{
	public void generateOddNumbers() {
		for(int i=1;i<100;i+=2) {
			System.out.println("Odd Number Generated"+i);
		}
	}
}
class EvenNumbers{
	public void generateEvenNumbers() {
		for(int i=2;i<100;i+=2) {
			System.out.println("Even Number Generated"+i);
		}
	}
}
public class GenerateOddEven {
	public static void main(String[] args) {
		OddNumbers oddNumbers = new OddNumbers();
		EvenNumbers evenNumbers = new EvenNumbers();
		oddNumbers.generateOddNumbers();
		evenNumbers.generateEvenNumbers();
	}

}
