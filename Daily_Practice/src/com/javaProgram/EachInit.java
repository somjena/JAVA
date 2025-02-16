package com.javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EachInit {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		List<String>list =Arrays.asList("ABC","DEF","GHI");
		for(String word:list) {
			l.add(init(word));
		}
		System.out.println(l);
	
}

	 static String init(String s) {
			char[]l=s.toCharArray();
			for(int i=0;i<l.length;i++) {
				if(i==0) {
					l[0]+=32;
				}
			}
			return new String(l);
		}
}