package com.Lambda_Expression.Predicate.Emp;

public class Emp {
	String name;
	int age;
	int id;
	double sal;
	
	public Emp(String name,int age,int id,double sal) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.sal=sal;
	}
	
	@Override
	public String toString() {
		return "name = "+name+" age = "+age+" id = "+id+" sal = "+sal;
	}

}
