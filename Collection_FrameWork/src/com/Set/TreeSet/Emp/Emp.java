package com.Set.TreeSet.Emp;

public class Emp implements Comparable<Emp>{
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
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return o.age-this.age;
	}

}
