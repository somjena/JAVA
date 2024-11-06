package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String exp="([a-z])\\1";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group() +" "+m.start()+" "+m.end());
		}

	}

}
