package com.String;

public class PrintVowel {

	public static void main(String[] args) {
		String s = "vowel";
		for(int i=0;i<s.length();i++) {
			if(CountVowel.check(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
