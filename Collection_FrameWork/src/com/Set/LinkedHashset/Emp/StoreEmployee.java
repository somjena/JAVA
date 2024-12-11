package com.Set.LinkedHashset.Emp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StoreEmployee {

	public static void main(String[] args) {
		Emp e1 = new Emp("Ankita", 1);
		Emp e4 = new Emp("Ankita", 1);
		Emp e2 = new Emp("Bablu", 2);
		Emp e3 = new Emp("Chinmay",3);
		
		
		Set<Emp> s = new LinkedHashSet<Emp>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		//System.out.println(s);
		Iterator i =s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
