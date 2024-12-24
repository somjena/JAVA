package com.Dequeue.Emp;

import java.util.ArrayDeque;

public class StoreEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp("Ankita", 1, 24, 24240.06);
		Emp e2 = new Emp("Bablu", 2, 25, 21000.16);
		Emp e3 = new Emp("Chaitanya", 3, 26, 24740.46);
		Emp e4 = new Emp("Debashish", 4, 27, 26240.96);
		Emp e5 = new Emp("Elon", 5, 22, 17546.06);
		
		ArrayDeque<Emp> a = new ArrayDeque<Emp>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		System.out.println(a);

	}

}
