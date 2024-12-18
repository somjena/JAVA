package com.Map.Programs;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(7, "Thala");
		m.put(45, "Sharma ji ka Beta");
		m.put(18, "Kohli");
		m.put(31, "David Bhai");
		
		
		Set<Entry<Integer,String>> e = m.entrySet();
		
		for(Entry<Integer,String> en :e) {
			System.out.println(en);
		}

	}

}
