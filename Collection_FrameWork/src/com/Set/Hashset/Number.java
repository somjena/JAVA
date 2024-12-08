package com.Set.Hashset;

import java.util.HashSet;
import java.util.Set;

public class Number {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(20);// No Duplicate Value Can Enters Into the Hashset 
		s.add(30);
		s.add("som");
		System.out.println(s);
	}

}
