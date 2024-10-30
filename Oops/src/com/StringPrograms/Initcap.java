package com.StringPrograms;

public class Initcap {

	public static void main(String[] args) {
		System.out.println(convert("priti ranjan ghadei"));
		

	}
	public static String convert(String s) {
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z')
			if(i==0||ch[i-1]==' ')
				ch[i]=(char)(ch[i]-32);
		}
		return new String(ch);
	}

}
