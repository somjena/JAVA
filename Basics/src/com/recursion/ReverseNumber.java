package com.recursion;
import java.util.*;
public class ReverseNumber {
	private static int rev ;
	
	public static int Reverse(int n) {//Reverse method
		if(n==0) return rev;
		rev = rev*10+n%10;
		return Reverse(n/=10);// method call by itself
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :-");
		int n = sc.nextInt();
		System.out.println(Reverse(n));
		
	
	}

}
