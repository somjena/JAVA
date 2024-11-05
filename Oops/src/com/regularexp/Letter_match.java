package com.regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letter_match {

	public static void main(String[] args) {
		String exp = "a";
		String name="Soumitra";
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(name);
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
		}

	}

}
