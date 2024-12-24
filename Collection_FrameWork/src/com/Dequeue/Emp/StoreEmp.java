package com.Dequeue.Emp;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StoreEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp("Ankita", 1, 24, 24240.06);
		Emp e2 = new Emp("Bablu", 2, 25, 21000.16);
		Emp e3 = new Emp("Chaitanya", 3, 26, 24740.46);
		Emp e4 = new Emp("Debashish", 4, 27, 26240.96);
		Emp e5 = new Emp("Elon", 5, 22, 17546.06);
		
		Predicate<Emp> e = emp->emp.sal>=24240;
		
		

		ArrayDeque<Emp> a = new ArrayDeque<Emp>();
		
		List<Emp> list = Arrays.asList(e1,e2,e3,e4,e5);
		for(Emp emp : list) {
			if(e.test(emp)) {
			a.addFirst(emp);	
			}else
				a.addLast(emp);
			
		}
		System.out.println(a);
		
		
		
		

	}

}
