package com.Loops_NumberPrograms;

import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		boolean flag =true;
		if(n<=1) {
			flag= false;
		}
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(n+" Is A Prime Number");
			
		}else {
			System.out.println(n + " iS Not A Prime Number");
			
		}
		
	}

}
