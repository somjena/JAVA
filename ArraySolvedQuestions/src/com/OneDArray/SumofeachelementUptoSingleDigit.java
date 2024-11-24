package com.OneDArray;
//Q.25
public class SumofeachelementUptoSingleDigit {

	public static void main(String[] args) {
		int []a= {23,55,57,93,10,1};
		
		
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			int Sum=0;
			while(n!=0) {
			int temp =n%10;
			Sum+=temp;
			a[i]=Sum;
			n/=10;
			}
			
			
		}
		for(int n:a) {
			System.out.println(n);
		}

	}

}
