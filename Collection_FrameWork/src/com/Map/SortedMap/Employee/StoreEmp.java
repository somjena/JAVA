package com.Map.SortedMap.Employee;


import java.util.Map;
import java.util.TreeMap;

public class StoreEmp {

	public static void main(String[] args) {
		Map<Integer,Emp> m = new TreeMap<Integer, Emp>(new DescComp());
		m.put(1, new Emp("Som",22));
		m.put(5, new Emp("Ankita",24));
		m.put(3, new Emp("Shrabana",28));
		m.put(4, new Emp("Bablu",18));
		
		
		System.out.println(" Employee  List According to Descending Order");
		for(Map.Entry<Integer, Emp> entry:m.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}


