package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		
		Pattern p = Pattern.compile("([a-z])\\1*");
		Matcher m =p.matcher(str);
		
		String s2 = "";
		while(m.find()) {
			String s1 =m.group();
			System.out.println(s1);
			s2+=s1.length()+s1.substring(0,1);
		}
		System.out.println(s2);

	}

}
