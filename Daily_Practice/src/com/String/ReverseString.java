package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String s= "Soumitra";
		char []c=s.toCharArray();
		//System.out.println(c.length);
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	}

}
