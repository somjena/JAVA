package com.recursion;
import java.util.*;
public class Pallindrome {
	private static int rev ;
	
	public static int Palindrome(int n) {
		if(n==0)return rev;
		rev=rev*10+n%10;
		return Palindrome(n/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number You Want To Check : -");
		int n = sc.nextInt();
		int temp = n;
		int res =Palindrome(n);
		System.out.println(res);
		if(temp==res) {
			System.out.println(temp + " is a Pallindrome Number");
		}else {
			System.out.println(temp + " is not a Pallindrome Number");
		}
		
		
		}

}
