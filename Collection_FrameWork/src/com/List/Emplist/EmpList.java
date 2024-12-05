package com.List.Emplist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpList {

	public static void main(String[] args) {
		Emp e1= new Emp("Soumitra Jena", 1);
		Emp e2 = new Emp("Shrabana Rout", 2);
		Emp e3 = new Emp("Ankita Biswal",3);
		
		
		
		List l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		System.out.println("Before Sorting");
		System.out.println(l);
		Collections.sort(l);
		//Collections.sort(l, new DescCompare());
		System.out.println("After Sorting");
		System.out.println(l);
		
		
		
	}

}
