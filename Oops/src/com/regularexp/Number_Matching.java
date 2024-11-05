package com.regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number_Matching {

	public static void main(String[] args) {
		String exp = "11";
		String match = "4r5113164fh11";
		Pattern p=Pattern.compile(exp);
		Matcher m= p.matcher(match);
		
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+" "+m.end());
			
	}

}
}