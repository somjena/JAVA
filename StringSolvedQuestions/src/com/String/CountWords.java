package com.String;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		String[] s2 = s1.split(" ");
		System.out.println(s2.length);
		

	}
	
	

}
