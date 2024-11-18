package com.OneDArray;

import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int []a= {5,1,2,4,1,3,2,4};
	
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1-j;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			
			}
		}
		}
		System.out.println("Largest Element in Array "+a[a.length-1]);
		
		
	}

}
