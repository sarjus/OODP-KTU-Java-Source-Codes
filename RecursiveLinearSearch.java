package com.sjcet.oopdemo;

import java.util.Scanner;

class Search{
	int n;
	int recursiveLinearSearch(int [] A,int i, int x){
		if(i>n-1) {
			return -1;
		}
		else if(A[i]==x) {
			return i;
		}
		else {
			return recursiveLinearSearch(A,i+1,x);
		}
	}
	
}
public class RecursiveLinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Elements in the array: ");
		Search objRef = new Search();
		objRef.n = sc.nextInt();
		int[] A = new int[objRef.n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<objRef.n;i++) {
			A[i] = sc.nextInt();
		}
		System.out.print("Enter the search element: ");
		int x = sc.nextInt();
		int searchFound = objRef.recursiveLinearSearch(A, 0, x);
		if(searchFound==-1) {
			System.out.println("The given item is not in the list");
		}
		else {
			System.out.println("The given item is found at the position: "+(searchFound+1));
		}
		

	}

}
