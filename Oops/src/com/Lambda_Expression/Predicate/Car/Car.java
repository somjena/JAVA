package com.Lambda_Expression.Predicate.Car;

public class Car {
	String name;
	int carno;
	Engine e;
	
	public Car(String name,int carno,Engine e) {
		this.name=name;
		this.carno=carno;
		this.e=e;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carno=" + carno + ", e=" + e + "]";
	}
	
	
	
	
	

}
