package com.PriorityQueue.Emp;

public class Emp {
	String name;
	int id;
	
	
	public Emp(String name,int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "name :- "+name+" "+"id:- "+id;
	}


/*	@Override
	public int compareTo(Object o) {
		return ((Emp)o).name.charAt(0)-this.name.charAt(0);
	}*/

}
