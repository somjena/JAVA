package com.Set.LinkedHashset.Car;

public class Car {
	String name;
	Engine e;
	
	public Car(String name,Engine e) {
		this.name=name;
		this.e=e;
		
	}
	public String toString() {
		return "name= "+name+" "+e;
	}
	
	public boolean equals(Object o) {
		Car c=(Car)o;
		return this.name.equals(c.name)&&this.e.equals(c.e);
	}
	public int hashCode() {
		return e.cc;
	}

}
