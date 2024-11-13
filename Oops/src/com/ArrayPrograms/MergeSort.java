package com.ArrayPrograms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int []a= {4,7,9,1,2,3,6,10,8};
		mergesort(a);
		System.out.println(Arrays.toString(a));
		

	}
	static void mergesort(int[]a) {
		if(a.length==1) return;
		int []left=new int[a.length/2];
		int []right=new int[a.length-left.length];
		
		int i =0;
		while(i<left.length) {
			left[i]=a[i];
			i++;
		}
		int j =0;
		while(j<right.length) {
			right[j]=a[i];
			j++;
			i++;
		}
		mergesort(left);
		mergesort(right);
		merge(left,right,a);
	}
	static void merge(int[]a,int[]b,int[]c) {
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[i]) {
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
	}

}
