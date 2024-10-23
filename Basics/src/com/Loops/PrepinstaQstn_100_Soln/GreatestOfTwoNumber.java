package com.Loops.PrepinstaQstn_100_Soln;

import java.util.Scanner;

public class GreatestOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2=sc.nextInt();
		if(num1==num2) {
			System.out.println(num1+" "+num2+" is Equal Number");
		}else if (num1>num2) {
			System.out.println(num1+ " is The Greater Number");	
		}else {
			System.out.println(num2+" is The Greater number");
		}
	}

}
