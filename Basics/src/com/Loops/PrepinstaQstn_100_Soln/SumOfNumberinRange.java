package com.Loops.PrepinstaQstn_100_Soln;

import java.util.Scanner;

public class SumOfNumberinRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Start Number");
		int st = sc.nextInt();
		System.out.println("Enter The Ending Number");
		int end = sc.nextInt();
		int Sum= 0;
		for(int i = st;i<=end;i++ ) {
		Sum+=i;
		}
		System.out.println(Sum);
	}
	

}
