package com.Lambda_Expression.Function.Programs;

import java.util.Scanner;
import java.util.function.Function;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number You Want");
		int num =sc.nextInt();
		Function<Integer, Integer> f = n ->{
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact*=i;
			}
			return fact;
		};
		
		System.out.println(f.apply(num)); 
	}

}
