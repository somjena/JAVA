package com.Map.Programs;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Data {

	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(7, "Thala");
		m.put(45, "Sharma ji ka Beta");
		m.put(18, "Kohli");
		m.put(31, "David Bhai");
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			int key = i.next();
			String res = m.get(key);
			System.out.println(key + "=" + res);
		}
	}

}
