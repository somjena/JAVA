package com.javaProgram.java8;

public class Emp implements Comparable<Emp>{
	String name;
	int age;
	int id;
	public Emp(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Emp o) {
		return o.age%2;
	}
	
	
	
	
	

}
