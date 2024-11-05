package com.regularexp;

import java.util.Scanner;

public class Replace_All_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 =sc.nextLine();
		String s2=s1.replaceAll("[a-z]", "");
		System.out.println(s2);

	}

}
