package com.Set.TreeSet.Number;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Num {

	public static void main(String[] args) {
		Set <Integer>s = new TreeSet<Integer>();
		s.add(10);
		s.add(60);
		s.add(30);
		s.add(50);
		s.add(20);
		//System.out.println(s);--->in the Sorted Order
		
		
		Iterator<Integer> i =s.iterator();
		
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	

	}

}
