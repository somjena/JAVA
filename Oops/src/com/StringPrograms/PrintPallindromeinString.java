package com.StringPrograms;

public class PrintPallindromeinString {

	public static void main(String[] args) {
		String s = "eye level car boy";
		String []words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(pali(words[i])) {
				System.out.print(words[i]);
			}
		}

	}
	public static boolean pali(String s) {
		//int st=0;
		int end=s.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(end)) {
				return false;
			}
			end--;
		}
		return true;
	}

}
