package com.Recursion;

public class PrimeNumberAlternative {
	public static void main(String[] args) {
		int res=isPrime(7, 7/2);
		if (res==1) {
			System.out.println("it is a Prime Number");
		}else {
			System.out.println("it is Not a Prime Number");
		}
		
	}
	static int isPrime(int num,int div) {
		if(div==1)return 1;
		if(num%div==0)return 0;
		return isPrime(num, div-1);
	}

}
