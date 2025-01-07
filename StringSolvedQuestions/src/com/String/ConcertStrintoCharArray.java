package com.String;

import java.util.Scanner;

public class ConcertStrintoCharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sr = sc.nextLine();
				
		for(int i=0;i<sr.length();i++) {
			char c = sr.charAt(i);
			System.out.println(c);
		}
		

	}

}
