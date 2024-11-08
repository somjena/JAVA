package com.ArrayPrograms;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9};
		rotate(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
	public static void rotate(int[]a) {
		int len =a.length;
		int temp =a[len-1];
		for(int i =len-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
		
	}

}
