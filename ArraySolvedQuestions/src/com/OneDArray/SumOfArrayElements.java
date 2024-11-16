package com.OneDArray;
//Q6
public class SumOfArrayElements {

	public static void main(String[] args) {
		int Sum=0;
		int []arr= {1,2,3,4,5,6};
		for(int i =0;i<arr.length;i++) {
			Sum+=arr[i];
		}
		System.out.println("Sum of Array Element :- "+Sum);

	}

}
