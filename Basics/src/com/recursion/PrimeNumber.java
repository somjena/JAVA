package com.recursion;
import java.util.*;
public class PrimeNumber {
	
	static int prime(int n,int div) {
		if(div==1)return 1;
		if(n%div==0)return 0;
		return prime(n,div-1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int n = sc.nextInt();
		int temp = n;
		if(n<2) {
			System.out.println(n+" Is Not A Prime Number ");return;
		}
		int div = n/2;
		int res = prime(n,div);
		if(res==1) {
			System.out.println(temp + "Is A Prime Number");
		}
		else {
			System.out.println(temp + "Is Not A Prime Number");
		}

	}

	
}
