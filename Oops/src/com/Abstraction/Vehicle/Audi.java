package com.Abstraction.Vehicle;

public class Audi extends Vehicle {

	@Override
	void start() {
		System.out.println("Audi Started....");
		
	}

	@Override
	void acc() {
		System.out.println("Audi Accelarate....");
		
	}

	@Override
	void stop() {
		System.out.println("Audi Stopped....");
		
	}

}
