package com.Dequeue.Emp;

public class Emp {
	String name;
	int id;
	int age;
	double sal;
	
	
	public Emp(String name, int id, int age, double sal) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
	
	

}
