package com.Map.SortedMap.Car;

public class Car {
	
	String cname;
	Engine e;
	
	
	public Car(String cname,Engine e) {
		
		this.cname=cname;
		this.e=e;
	}
	
	
	public String toString() {
		return "Cname= "+cname+" "+e;
	}

}
