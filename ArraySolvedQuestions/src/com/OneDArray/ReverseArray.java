package com.OneDArray;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int []a= {1,3,4,5,6,7,2,9};
		int []temp=new int [a.length];
		for(int i=a.length-1;i>=0;i--) {
		temp[i++]=a[i];
			
		}
		System.out.print(Arrays.toString(temp));
		
	}

}
