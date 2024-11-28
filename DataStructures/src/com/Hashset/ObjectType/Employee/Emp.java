package com.Hashset.ObjectType.Employee;

public class Emp {
	int empid;
	String empname;
	
	
	public Emp(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "Empid--"+empid+" "+"Empname--"+empname;
	}
	@Override
	public boolean equals(Object key) {
		if(!(key instanceof Emp)) return false;
		
		Emp e=(Emp)key; 
		return empid==e.empid && empname.equals(e.empname);
	}
	@Override
	public int hashCode() {
		return empid;
	}

}