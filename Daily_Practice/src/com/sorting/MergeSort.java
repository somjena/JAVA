package com.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int []a = {2,5,9,8,6,3,2};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		if(a.length<=1)return;
		int []left= new int [a.length/2];
		int []right=new int [a.length-left.length];
		
		//copy the values from a[] to left [];
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		//copy the value from a[] to right[]
		for(int i=0;i<right.length;i++) {
			right[i]=a[left.length+i];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}

	private static void merge(int[] left, int[] right, int[] a) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				a[k++]=left[i++];
			}else {
				a[k++]=right[j++];
			}
		}
		while(i<left.length) {
			a[k++]=left[i++];
		}
		while(j<right.length) {
			a[k++]=right[j++];
		}
		
	}

}
