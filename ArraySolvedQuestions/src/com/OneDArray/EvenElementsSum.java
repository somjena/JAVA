package com.OneDArray;

public class EvenElementsSum {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6};
		int Esum=0;
		for(int i =0;i<num.length;i++) {
			if(num[i]%2==0) {
				 Esum+=num[i];
			}
		}
		System.out.println(Esum);

	}

}
