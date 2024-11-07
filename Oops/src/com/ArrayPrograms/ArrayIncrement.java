package com.ArrayPrograms;

import java.util.Arrays;

public class ArrayIncrement {

	public static void main(String[] args) {
		int arr []=new int [4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		System.out.println(Arrays.toString(arr));

	}

}
