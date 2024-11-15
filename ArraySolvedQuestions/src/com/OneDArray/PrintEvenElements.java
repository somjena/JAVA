package com.OneDArray;

public class PrintEvenElements {

	public static void main(String[] args) {
	
		int []arr={1,2,3,4,5,6};
		
		for(int n:arr) {
			if(n%2==0) 
				System.out.print(n);
		}
	}

}
