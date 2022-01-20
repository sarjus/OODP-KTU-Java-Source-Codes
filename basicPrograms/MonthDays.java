/**
* The MonthDays program implements an application that
* simply demonstrates use of control statement switch in Java.
* The code accepts year and month from the user and 
* displays the number of days in a particular month:
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-22 
*/
package com.sjcet.basicPrograms;
import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String monthName;
		int year;
		int numberOfDays=0;
		System.out.println("Enter the year(YYYY):");
		year = sc.nextInt();
		
		System.out.println("Enter the Month Name:");
		monthName = sc.next();
		
		switch(monthName.toLowerCase()) {
		case "january":case "march":case "may":case "july":
		case "august": case "october":case "december":
			numberOfDays =31;
			break;
		case "april":case "june":case "september":case "november":
			numberOfDays =30;
			break;
		case "february":
			/*
			 * A year is leap year if the following conditions are 
			 * satisfied: Year is multiple of 4 and not multiple of 100. 
			 * Year is multiple of 400.
			 */
			if (((year % 4 == 0) && !(year % 100 == 0))
                    || (year % 400 == 0)) {
				numberOfDays = 29;
			}//end of if
			else {
				numberOfDays = 28;
			}//end of else
			break;
		default:
            System.out.println("Invalid month.");
            break;
		}//end of switch
		System.out.println("The number of days in "+
		monthName+" "+year+" is "+numberOfDays);
		sc.close();
	}//end of main
}//end of class
