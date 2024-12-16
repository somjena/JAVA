package com.Map.SortedMap.Employee;

public class Emp {
	String name;
	int age;
	
	
	public Emp(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return " name - "+name+" age - "+age;
	}

}
