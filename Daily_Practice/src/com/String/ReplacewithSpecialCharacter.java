package com.String;

public class ReplacewithSpecialCharacter {
	public static void main(String[] args) {
		String s = "kamana";
		//String res="";
		System.out.println(conv(s));
//		for(int i = 0;i<s.length();i++) {
//			if(s.charAt(i)=='a') {
//			 res =s.replace('a', '@');
//			}
//		}
//		System.out.println(res);
		
	}
	public static String conv(String s) {
	char[]	ch=s.toCharArray();
	
	char[]temp=new char[s.length()];
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a') {
			temp[i]='@';
		}else {
			temp[i]=ch[i];
		}
		
	}
		return new String (temp);
		
	}

}
