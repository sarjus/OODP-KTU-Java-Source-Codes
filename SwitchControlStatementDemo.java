/**
* The SwitchControlStatementDemo program implements an application that
* simply demonstrates use of control statement switch in Java.
* The code displays the name of the month, based on the value of month, 
* using the switch statement.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-22 
*/
package com.sjcet.basicPrograms;
import java.util.Scanner;

public class SwitchControlStatementDemo {
	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number between 1-12:");
		month = sc.nextInt();
		String monthName;
		switch (month){
			case 1:  monthName = "January";
			break;
			case 2:  monthName = "February";
			break;
			case 3:  monthName = "March";
			break;
			case 4:  monthName = "April";
			break;
			case 5:  monthName = "May";
			break;
			case 6:  monthName = "June";
			break;
			case 7:  monthName = "July";
			break;
			case 8:  monthName = "August";
			break;
			case 9:  monthName = "September";
			break;
			case 10: monthName = "October";
			break;
			case 11: monthName = "November";
			break;
			case 12: monthName = "December";
			break;
			default: monthName = "Invalid month";
            break;
		}
		System.out.println(monthName);
		sc.close();
	}
}
