package com.Set.TreeSet.Emp;

public class Emp implements Comparable{
	String name;
	int age;
	
	public Emp(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public String toString() {
		return "Name ="+name+" age = "+age;
	}

	@Override
	public int compareTo(Object o) {
	Emp e = (Emp)o;
		return this.age-e.age;
	}

}
