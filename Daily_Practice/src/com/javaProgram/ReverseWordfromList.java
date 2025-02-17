package com.javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordfromList {

	public static void main(String[] args) {
		List<String>revlist=new ArrayList<String>();
		List<String>list =Arrays.asList("ABC","DEF","GHI");
		Collections.reverse(list);
		for(String s :list) {
			revlist.add(reverse(s));
		}
		System.out.println(revlist);
	}
	public static String reverse(String s) {
		char[]ch=s.toCharArray();
		int j=0;
		char[]temp=new char[s.length()];
		for(int i=ch.length-1;i>=0;i--) {
			temp[j++]=ch[i];
		}
		return new String (temp);
	}
}

