package com.OneDArray;
//Q19
public class SquareOfEachElement {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		
		for(int i=0;i<num.length;i++) {//traverse the array from 0th index to the Last index
			int Square =num[i]*num[i];//int Variable Which Store the Sqr of Each Element
			System.out.print(Square+" ");
		}
		

	}

}
