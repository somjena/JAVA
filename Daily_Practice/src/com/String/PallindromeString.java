package com.String;

public class PallindromeString {
	public static void main(String[] args) {
		String s= "malayalam";
	
		System.out.println(isPallindrome(s));

	}
	public static boolean isPallindrome(String s) {
	char[]ch=	s.toCharArray();
	int j=ch.length-1;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=ch[j]) {
			return false;
		}
		j--;
	}
		return true;
		
	}

}
