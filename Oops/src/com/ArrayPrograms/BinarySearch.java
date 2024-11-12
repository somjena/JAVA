package com.ArrayPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		int []a= {2,5,7,9,10,13,15,19};
		System.out.println(BinarySearch(a, 15));
		System.out.println(BinarySearch(a, 18));
		

	}
	static int BinarySearch(int []a,int e) {
		int start = 0,end = a.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(e==a[mid])return mid;
			else if(e<a[mid])end=mid-1;
			else start=mid+1;
		}
		return -1;
	}

}
