package com.OneDArray;

public class PrintPresentVowel {

	public static void main(String[] args) {
		char []c= {'a','b','c','d','e','f','g'};
		
		
		
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			System.out.println(c[i]);
		}

	}

}
