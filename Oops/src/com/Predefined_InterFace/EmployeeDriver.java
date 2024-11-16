package com.Predefined_InterFace;

import java.util.Arrays;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee []d = {
				new Employee("som", 24, 1, 2220.6),
				new Employee("Annkita", 22, 1, 44820.6),
				new Employee("sharabana", 23, 1, 67820.6),
				
		};
		Arrays.sort(d);
		for(Employee e :d) {
			System.out.println(e + "-------");
		}
		Arrays.sort(d,new Emp_SalComparator());
		for(Employee e :d) {
			System.out.println(e);
		}
				
		

	}

}
