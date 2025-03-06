package com.String;

public class Occurance {

	public static void main(String[] args) {
		String s = "Ramana";
		int count[]=new int[256];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			count[c]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.println((char)i+"="+count[i]);
			}
			
				
		}
		
	}

}
