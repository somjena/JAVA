package com.List.Emplist;

import java.util.Comparator;

public class Emp implements Comparable<Emp>{
	String empname;
	int empid;
	
	public Emp(String empname,int empid) {
		this.empname=empname;
		this.empid=empid;
	}
	public String toString() {
		return "empname-"+empname+"empid-"+empid;
	}
	@Override
	public int compareTo(Emp o) {
		//Desecending order of Employee
		return o.empid-this.empid;
	}
	
	
}



	