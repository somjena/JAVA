package com.String;

public class Mixing {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String n = "";
	//	output = adbecf
		for(int i=0;i<s1.length();i++) {
			n+=s1.charAt(i)+""+s2.charAt(i);
			
		}
		System.out.println(n);
	}
}
