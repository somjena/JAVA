package com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaximumOccurance {

	public static void main(String[] args) {
		String s = "Ramana";
		count(s);
		//output a=3;

	}
	public static void count(String s) {
		Map<Character, Integer> ch = new LinkedHashMap<Character, Integer>();
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(ch.containsKey(a[i])) {
				ch.put(a[i], ch.get(a[i])+1);
			}else {
				ch.put(a[i], 1);
			}
		}
		System.out.println(s +":"+ch);
	}

}
