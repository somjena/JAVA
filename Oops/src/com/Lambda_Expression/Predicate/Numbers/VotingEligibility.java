package com.Lambda_Expression.Predicate.Numbers;

import java.util.Scanner;
import java.util.function.Predicate;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age");
		int age = sc.nextInt();
		Predicate<Integer> p=i -> i>=18;
		if(p.test(age)) {
			System.out.println("You Are Eligible For Voting");
			return;
		}
		System.out.println("You Are Not Eligible For Voting");
		
		

	}

}
