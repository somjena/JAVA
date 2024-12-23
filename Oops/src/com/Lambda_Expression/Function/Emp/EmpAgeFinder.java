package com.Lambda_Expression.Function.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EmpAgeFinder {

	public static void main(String[] args) {
		List<Emp> emplist = Arrays.asList( new Emp("Alice", 1, 25, "California"),
        new Emp("Bob", 2, 30, "New York"),
        new Emp("Charlie", 3, 28, "Texas"),
        new Emp("David", 4, 35, "Florida"),
        new Emp("Eve", 5, 22, "Nevada"),
        new Emp("Frank", 6, 40, "Ohio"),
        new Emp("Grace", 7, 27, "Washington"),
        new Emp("Hannah", 8, 32, "Arizona"),
        new Emp("Ivy", 9, 29, "Oregon"),
        new Emp("Jack", 10, 26, "Colorado"));
		
		Function<Emp, Integer> agefind = emp ->emp.age;
		
		
		for(Emp e :emplist) {
			System.out.println(e.name+" age is "+agefind.apply(e));
		}
	}
}

	


