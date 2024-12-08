package com.PriorityQueue.Cars;

public class Car {
	String name;
	Engine e;
	
	
	public Car(String name,Engine e) {
		this.name=name;
		this.e=e;
	}
	@Override
	public String toString() {
		return "name="+name+" "+e;
	}
	

}
