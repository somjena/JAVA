package com.ArrayPrograms;

public class CopyArray {

	public static void main(String[] args) {
		int []a= {10,20,30,40};// Declare an Array
		int []b;
		b=a; // copy the Reference
		b[0]=50;
		for(int ar:b) {
			System.out.println(ar);
		}
		

	}

}
