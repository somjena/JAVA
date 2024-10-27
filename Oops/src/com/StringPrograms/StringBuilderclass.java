package com.StringPrograms;

import java.util.Scanner;

public class StringBuilderclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String name = sc.nextLine();
		StringBuilder s1 = new StringBuilder(name);
		
		
		System.out.println(s1);

	}

	@Override
	public String toString() {
		return "StringBuilderclass [toString()=" + super.toString() + "]";
	}

}
