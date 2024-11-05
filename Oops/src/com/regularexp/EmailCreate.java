package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCreate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Etent");
		String email = sc.nextLine();
		Pattern p = Pattern.compile("[a-z]+@{1}+gmail.com");
		boolean isMatch = p.matcher(email).matches();
		if(isMatch) {
			System.out.println("Correct email :- "+email);return;
		}
		System.out.println("incorrect try");
		
		

	}

}
