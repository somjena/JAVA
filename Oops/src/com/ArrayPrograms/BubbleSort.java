package com.ArrayPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {3,9,4,6,5,7,8};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
		

	}
	static void sort(int []a) {
		for(int i =0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				}
			}
		}
		
	}
	/*[3,9,4,6,5,7,8]*/

}