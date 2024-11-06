package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;                         /* take the 1st letter and same for the 3rd letter*/
import java.util.regex.Pattern;

public class Backtracing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		String exp ="([a-z])([a-z])\\1";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s1);
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
		

	}

}
