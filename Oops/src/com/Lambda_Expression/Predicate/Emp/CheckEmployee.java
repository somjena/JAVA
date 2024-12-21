package com.Lambda_Expression.Predicate.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckEmployee {

	public static void main(String[] args) {
		
		Emp e1 = new Emp("Rohit Sharma", 42, 1, 2244000.96);
		Emp e2 = new Emp("Virat Kohli", 41, 2, 968745580.96);
		Emp e3 = new Emp("Ms Dhoni", 56, 5, 2247840.96);
		Emp e4 = new Emp("Suresh Raina", 38, 4, 659440.96);
		Emp e5 = new Emp("R Ashwin", 45, 3, 3564440.96);
		
		
		
		List<Emp> list =Arrays.asList(e1,e2,e3,e4,e5);
		
		
		Predicate<Emp> p = e ->e.sal>=5486556;
		
		for(Emp e:list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
	}

}
