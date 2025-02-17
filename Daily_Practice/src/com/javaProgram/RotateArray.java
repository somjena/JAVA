package com.javaProgram;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		rotate(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void rotate(int []a) {
		int len=a.length;
		int temp=a[a.length-1];
		
		for(int i=len-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
	}

}
