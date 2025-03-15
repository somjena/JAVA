package com.String;

public class Sumofno {

	public static void main(String[] args) {
		String s= "ab11cd22";
		StringBuilder sb = new StringBuilder();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='1' && ch[i]<='9') {
				sb.append(ch[i]);
			}
			if(ch[i+1]>='a'&&ch[i+1]<='z') {
				
			}
				
		}
		System.out.println(sb);

	}

}
