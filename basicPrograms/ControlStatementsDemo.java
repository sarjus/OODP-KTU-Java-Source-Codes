/**
* The ControlStatementsDemo program implements an application that
* simply demonstrates use of if-else control statement in Java.
*
* @author  Sarju S
* @version 1.0
* @since   2020-09-19 
*/
package com.sjcet.basicPrograms;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		float internalMarksForAttendance=0f;
		float attendancePercentage = 62.35f;
		if(attendancePercentage>=90) {
			internalMarksForAttendance = 10;
		}
		else {
			internalMarksForAttendance = attendancePercentage/10;
		}
		System.out.println("Internal Marks for Attendance: "
				+ ""+internalMarksForAttendance);
	}
}
