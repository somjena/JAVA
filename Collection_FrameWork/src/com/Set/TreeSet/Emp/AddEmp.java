package com.Set.TreeSet.Emp;

import java.util.Set;
import java.util.TreeSet;

public class AddEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp("Som", 22);
		Emp e2 = new Emp("Som", 22);
		
		
		
		
		Set s = new TreeSet();
		s.add(e1);
		s.add(e2);
		
		
		System.out.println(s);

	}

}
