package com.ArrayBasics;

import java.util.Arrays;

public class CreateDuplicateArray {
	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		int []copy=new int[a.length];
		for(int i=0;i<a.length;i++) {
			copy[i]=a[i];
		}
		System.out.println(Arrays.toString(copy));
	}

}
