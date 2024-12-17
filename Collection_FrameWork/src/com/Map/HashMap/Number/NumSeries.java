package com.Map.HashMap.Number;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NumSeries {
	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		m.put("one", 1);
		m.put("two",2);
		m.put("five", 5);
		m.put("one", 1);
		System.out.println(m);
		Set<String> s = m.keySet();
		Iterator<String> i =s.iterator();
		while(i.hasNext()) {
			System.out.println(m.get(i.next()));
		}
	}

}
