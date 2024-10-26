package com.StringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The name U Want to Reverse");
		String name = sc.nextLine();
	    System.out.println(Reverse(name));
		

	}
	    static String Reverse(String s) {
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}

}
