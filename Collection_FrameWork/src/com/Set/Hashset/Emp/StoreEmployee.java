package com.Set.Hashset.Emp;

import java.util.HashSet;
import java.util.Set;

public class StoreEmployee {

	public static void main(String[] args) {
		
		Emp e1 = new Emp("Soumitra", 1, 22, 6371326214L);
		Emp e2 = new Emp("Soumitra", 1, 22, 6371326214L);
		Emp e3 = new Emp("Soumitra", 1, 22, 6371326214L);
		
		
		
		
		Set<Emp> s = new HashSet<Emp>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		
		System.out.println(s);
	}

}
