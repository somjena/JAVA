package com.Set.Hashset.String;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringStore {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Ankita");
		s.add("Bablu");
		s.add("Chinmay");
		System.out.println(s);
		System.out.println(s.contains("Bablu"));
		
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		s.clear();
		System.out.println(s.isEmpty());
	}
	
	
	
	
		
	

}
