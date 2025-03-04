package com.String;

public class CountWord {
	public static void main(String[] args) {
		String s= "ab123cd";
		int count=0;
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&ch[i]<='9') {
				count++;
			}
		}
		System.out.println(count);
	}

}
