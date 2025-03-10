package com.StringPrograms;

public class Uppercasetolower {
	public static void main(String[] args) {
		String s = "SOUMITRA";
		char ch[] =s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			ch[i]=(char)(ch[i]+32);
			System.out.print(ch[i]);
		}
	}

}
