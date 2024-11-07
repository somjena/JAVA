package com.ArrayPrograms;

public class DeclareApproach2 {

	public static void main(String[] args) {
		/*Second Appraoch to Declare an Array is
		 * Sysntax : - datatype [] ref = {e1,e2,e3,e4}*/
		int []arr= {10,20,30,40};
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int n:arr) {
			System.out.println(n);
		}

	}

}
