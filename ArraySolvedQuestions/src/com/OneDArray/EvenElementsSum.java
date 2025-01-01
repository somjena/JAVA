package com.OneDArray;

public class EvenElementsSum {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6};//int Type Array
		int Esum=0; // Esum Variable to Store the Integer Value 
		for(int i =0;i<num.length;i++) {
			if(num[i]%2==0) {
				 Esum+=num[i];//Sum of Each The Element In the Arrray
			}
		}
		System.out.println(Esum);

	}

}
