package com.OneDArray;

public class PrimeNumbersinArray {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6};
		
		
		for(int i =0;i<ar.length;i++) {
			boolean Flag =true;
			if(ar[i]==0||ar[i]==1)continue;
			for(int j=2;j<=ar[i]/2;j++) {
				if(ar[i]%j==0) {
					Flag=false;
					break;
				}
			}
			if(Flag) {
				System.out.println(ar[i]);
			}
		}

	}

}
