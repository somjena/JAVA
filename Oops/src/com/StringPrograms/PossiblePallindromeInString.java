package com.StringPrograms;

import java.util.Scanner;

public class PossiblePallindromeInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s = sc.nextLine();
		for(int i=0;i<s.length()-1;i++) {
			for(int j =i+1;j<s.length();j++) {
				if(isPallindrome(s, i, j)) {
					System.out.println(s.substring(i, j+1));
				}
			}
		}

	}
	static boolean isPallindrome(String s,int start,int end) {
		int i =start;
		int j =end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
