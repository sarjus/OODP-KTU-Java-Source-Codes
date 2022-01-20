package com.sjcet.morefeatures;
interface College{
	public String getCollegeName();
}
interface Department extends College{
	public String getDepartmentName();
}
//class implements both interfaces and provides 
//implementation to the method. 
class Student implements Department{
	String collegeName;
	String departmentName;
	Student(String collegeName,String departmentName ){
		this.collegeName = collegeName;
		this.departmentName = departmentName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public String getDepartmentName() {
		return departmentName;
		
	}
}
public class InterfaceExtendsDemo {

	public static void main(String[] args) {
		Student s1 = new Student("SJCET","CSE");
		// calling the method implemented 
        // within the class. 
		System.out.println("College Name: "+s1.collegeName);
		System.out.println("Department Name: "+s1.departmentName);

	}

}
