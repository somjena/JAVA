package com.javaProgram.java8;

import java.util.Comparator;

public class Agecomp implements Comparator<Emp>{

	

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}

}
