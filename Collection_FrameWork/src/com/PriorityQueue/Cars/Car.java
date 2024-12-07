package com.PriorityQueue.Cars;

public class Car implements Comparable<Car>{
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
	
	@Override
	public int compareTo(Car o) {
		return o.e.cc-e.cc;
	}

}
