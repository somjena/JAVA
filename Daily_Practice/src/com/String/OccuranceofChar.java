package com.String;

import java.util.Arrays;

public class OccuranceofChar {
	public static void main(String[] args) {
		String s = "AssmnAN";
		//output A=2,s=2,m=1,n=1,N=1;
		int []charcount = new int[256];
		
		//s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			charcount[s.charAt(i)]++;
			
		}
		System.out.println(Arrays.toString(charcount));
		for(int i=0;i<charcount.length;i++) {
			if(charcount[i]>0) {
				System.out.println((char)i+"="+charcount[i]);
			}
		}
		
	}

}
