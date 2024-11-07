package com.ArrayPrograms;

public class CopyArray {

	public static void main(String[] args) {
		int []a= {10,20,30,40};
		int []b;
		b=a;
		b[0]=50;
		for(int ar:b) {
			System.out.println(ar);
		}
		

	}

}
