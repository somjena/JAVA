package com.String;

public class Stringinit {

	public static void main(String[] args) {
		String s= "india that is bharat";
		System.out.println(convert(s));
	}
	public static String convert(String s) {
		char[]ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z')
				if(i==0 ||ch[i-1]==' ')
					ch[i]=(char)(ch[i]-32);
		}
			
		
		return new String(ch);
	}
	
	}

