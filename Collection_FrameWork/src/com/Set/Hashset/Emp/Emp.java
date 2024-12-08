package com.Set.Hashset.Emp;

public class Emp {
	String name;
	int id;
	int age;
	long contact;
	
	
	public Emp(String name,int id ,int age,long contact) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.contact=contact;
	}
	public String toString() {
		return  "name = "+name+" id = "+id+" age ="+age+" contact = "+contact+"\n";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object o) {
		Emp e = (Emp)o;
		return this.name.equals(e.name)&&this.id==e.id && this.age==e.age&& this.contact==e.contact;
		
	}
	

}
