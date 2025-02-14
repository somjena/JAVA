package com.OneDArray;

public class LargestandSmallest {

	public static void main(String[] args) {
		int []a= {1,3,4,5,6,7,2,9};
		int smallest=a[0];
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}else {
				if(a[i]>largest) {
					largest=a[i];
				}	
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}
