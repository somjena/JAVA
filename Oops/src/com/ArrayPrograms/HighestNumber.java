package com.ArrayPrograms;

public class HighestNumber {

	public static void main(String[] args) {
		int []a= {5,6,7,5,1,9,3};
		int highest =a[0];
		
		for(int i =1;i<a.length;i++) {
			if(a[i]>highest) {// condition
				highest=a[i];
			}
			
		}
		System.out.println(highest);
		

	}

}
