package com.ArrayBasics;

public class AlternativeElement {
	public static void main(String[] args) {
		int []a = {1,5,6,4,7,9,2,3};
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.print(a[i]);
			}
		}
	}

}
