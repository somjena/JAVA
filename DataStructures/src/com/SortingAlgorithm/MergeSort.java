package com.SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int []a = {2,5,9,8,6,3,2};
		System.out.println("Before sort"+" "+Arrays.toString(a)); 
		sort(a);
		System.out.println("After sort"+" "+Arrays.toString(a)); 

	}
	public static void sort(int []a) {
		if(a.length<=1)return;
		
		int []left= new int [a.length/2];
		int []right= new int [a.length-left.length];
		
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[j+left.length];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int []left,int[]right,int[]res) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				res[k++]=left[i++];
			}else {
				res[k++]=right[j++];
			}
		}
		while(i<left.length) {
			res[k++]=left[i++];
		}
		while(j<right.length) {
			res[k++]=right[j++];
		}
	}

}