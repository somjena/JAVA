package com.Set.LinkedHashset.Num;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumberSeries {

	public static void main(String[] args) {
		Set <Integer>s = new LinkedHashSet<Integer>();
		s.add(5);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
