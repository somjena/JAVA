package com.regularexp;

public class ReplaceAllrgx {

	public static void main(String[] args) {
		String s1 = "a1b2cd436";
		String s2 = s1.replaceAll("[0-9]", "");
		System.out.println(s2);

	}

}
