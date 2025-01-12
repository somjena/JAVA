package com.Set.TreeSet.Emp;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.Map.HashMap.Emp.Emp;

public class AddEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp("Som", 22);
		Emp e2 = new Emp("Ankita", 24);
		
		
		
		
		Set<Emp> s = new TreeSet<Emp>();
		s.add(e1);
		s.add(e2);
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println(s);

	}

}
