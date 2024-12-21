package com.Lambda_Expression.Predicate.Numbers;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckNumberInrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number You Want to Check");
		int n = sc.nextInt();
		Predicate<Integer> p  = i->i>=1 && i<=100;
		if(p.test(n)) {
			System.out.println("Available in Range 1 --- 100");
			return;
		}
		System.out.println("Not Available in Range 1 --- 100");
		
	}

}
