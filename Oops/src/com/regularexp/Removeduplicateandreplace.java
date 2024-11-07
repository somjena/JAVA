package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Removeduplicateandreplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String :-");
		String str = sc.nextLine();
		
		Pattern p =Pattern.compile("([a-z])\\1+");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			String s1 =m.group();
			String s2 = s1.substring(0,1);
			str =str.replaceAll(s1, s2);
		}
		System.out.println(str);
		

	}

}
