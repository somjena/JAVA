package com.Map.HashMap.Emp;

public class Emp {
	String name;
	int id;
	public Emp(String name,int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Name "+name+" id "+id;
	}

}
