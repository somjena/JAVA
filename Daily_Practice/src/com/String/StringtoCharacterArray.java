package com.String;

public class StringtoCharacterArray {

	public static void main(String[] args) {
		char[]ch= convertCharArray("rintu");
		for(char c:ch) {
			System.out.println(c);
		}
	}
	public static char[]convertCharArray(String s){
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		return ch;
		
	}

}
