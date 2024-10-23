package com.Loops.PrepinstaQstn_100_Soln;
import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number You Want to check");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println(n+ " is A Even Number");
		}else {
		System.out.println(n+ " is a Odd Number");
		}
	}

}
