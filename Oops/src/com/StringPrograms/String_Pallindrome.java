package com.StringPrograms;

import java.util.Scanner;

public class String_Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String You Want To Check");
		String name = sc.nextLine();
		System.out.println(isPallindrome(name));
		

	}
	static boolean isPallindrome(String s) {
		int i =0; int j= s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
				i++;
				j--;
			
		}
		return true;
	}

}
