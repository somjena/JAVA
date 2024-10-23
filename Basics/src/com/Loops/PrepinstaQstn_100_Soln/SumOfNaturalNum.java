package com.Loops.PrepinstaQstn_100_Soln;
import java.util.*;
public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int n = sc.nextInt();
		int Sum=0;
		for(int i = 1;i<=n;i++) {
			Sum+=i;
		}
		System.out.println(Sum);

	}

}
