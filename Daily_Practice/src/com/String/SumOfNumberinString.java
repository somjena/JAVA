package com.String;

public class SumOfNumberinString {
	public static void main(String[] args) {
		int Sum=0;
		String s = "rintu1234";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&s.charAt(i)<='9') {
			Sum+=s.charAt(i)-'0';
				
			}
		}
		System.out.println(Sum);
		
	}

}
