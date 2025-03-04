package com.String;

public class StringtoCharacterArray {

	public static void main(String[] args) {
		char[]ch= convertCharArray("rintu");
		

	}
	public static char[]convertCharArray(String s){
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		return ch;
		
	}

}
