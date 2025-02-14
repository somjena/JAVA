package com.OneDArray;

import java.util.Arrays;

public class Approach2 {

	public static void main(String[] args) {
		int []a= {1,3,4,5,6,7,2,9};
		Arrays.sort(a);
		int []even =new int [a.length] ;
		int []odd= new int [a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[i]=a[i];
			}
			else {
				odd[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(even)+Arrays.toString(odd));
		

	}

}
