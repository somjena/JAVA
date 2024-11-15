package com.OneDArray;
//Q-5
public class PrintOddElements {

	public static void main(String[] args) {
		int []num= {1,2,3,4,5,6};
		
		for(int nums:num) {
			if(nums%2!=0) {
				System.out.println(nums);
			}
		}

	}

}
