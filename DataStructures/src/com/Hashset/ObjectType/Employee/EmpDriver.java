package com.Hashset.ObjectType.Employee;

import com.Hashset.ObjectType.Hashset;

public class EmpDriver {

	public static void main(String[] args) {
		Emp e1 = new Emp(1,"Soumitra jena");
		Emp e2 = new Emp(1,"Soumitra jena");
		
		Hashset h = new Hashset();
		h.add(e1);
		h.add(e2);
		h.traverse();

	}

}
