package com.regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PossibleGroups {

	public static void main(String[] args) {
		/*it will match single char as well as the duo and triple ........*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		String exp="([a-z])\\1*";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+ " "+m.end());
		}

	}

}
