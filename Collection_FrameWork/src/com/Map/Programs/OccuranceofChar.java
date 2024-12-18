package com.Map.Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceofChar {
	public static void main(String[] args) {
		String s = "banana";
		Map<Character, String>  m = new LinkedHashMap<Character, String>();
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(!m.containsKey(ch))
				m.put(ch, i+"");
			else 
				m.put(ch, m.get(ch)+","+i);
		}
		System.out.println(m);
	}

}
