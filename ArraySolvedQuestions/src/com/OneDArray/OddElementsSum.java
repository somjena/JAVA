package com.OneDArray;
//Q9
public class OddElementsSum {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6};
		int Osum=0;
		for(int i =0;i<num.length;i++) {
			if(num[i]%2!=0) {
				 Osum+=num[i];
			}
		}
		System.out.println(Osum);

	}

}
