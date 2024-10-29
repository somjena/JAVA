package com.StringPrograms;

public class SumofDigitintString {

	public static void main(String[] args) {
		String s = "ab12cd3ef65hg";
		int Sum =0;
		for(int i =0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				Sum+=Character.getNumericValue(c);
			}
		}
		System.out.println(Sum);

	}

}