package com.OneDArray;

import java.util.Arrays;

public class SmallestElementofArray {

	public static void main(String[] args) {
		
		int []a= {1,2,1,3,2,4};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
		}
		System.out.println(a[0]);

	}

}
