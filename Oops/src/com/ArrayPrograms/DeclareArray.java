package com.ArrayPrograms;

public class DeclareArray {

	public static void main(String[] args) {
		int [] ar = new int [4];
		System.out.println(ar.length);
		System.out.println(ar);
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		
		for(int  i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		
			
		}
		for(int n:ar) {
			System.out.println(n);
			
		}
			

	}

}
