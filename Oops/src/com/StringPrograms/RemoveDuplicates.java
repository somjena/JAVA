package com.StringPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s1 = "banana";
		String s2 = "";
		
		for(int i =0;i<s1.length();i++) {
			char c= s1.charAt(i);
			if(!s2.contains(c+"")) s2+=c;
		}
		System.out.println(s2);

	}

}
