package com.Map.SortedMap;

import java.util.Map;
import java.util.TreeMap;

public class Numbers {

	public static void main(String[] args) {
		Map <Integer,Integer>m = new TreeMap<Integer,Integer>();
		m.put(1, 10);
		m.put(2,20);
		m.put(3, 30);
		m.put(3, 40);// Instead of Creating New It Modify the Given Key's Value
		int n=m.get(3);
		System.out.println(n);
	}
}
