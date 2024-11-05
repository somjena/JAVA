package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumofDigitinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String with Some Number:-");
		String s = sc.nextLine();
		int Sum=0;
		Pattern p = Pattern.compile("[0-9]");
		Matcher m =p.matcher(s);
		while(m.find()) {
			Sum+=Integer.parseInt(m.group());
			System.out.println(m.group());
		}
		System.out.println(Sum);
		
		
		

	}

}
