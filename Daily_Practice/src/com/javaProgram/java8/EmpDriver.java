package com.javaProgram.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDriver {
	public static void main(String[] args) {
		Emp e1=new Emp("som", 5, 30);
		Emp e2=new Emp("rintu", 9, 30);
		Emp e3=new Emp("pintu", 56, 30);
		Emp e4=new Emp("rintu", 2, 30);
		List <Emp> e=Arrays.asList(e1,e2,e3,e4);
		List<Emp> l = e.stream().filter(i->i.age%2==0).collect(Collectors.toList());
		
		//System.out.println("Before Sorting"+e);
	l.sort(new Agecomp());
		System.out.println("After Sorting"+l);
		
		
	}

	

}
 
