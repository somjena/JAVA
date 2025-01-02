package com.Abstraction.Vehicle;

abstract public class Vehicle {
	 abstract void start();
	 abstract void acc();
	 abstract void stop();

}
class BMW extends Vehicle{

	@Override
	void start() {
		System.out.println("BMW Start");
		
	}

	@Override
	void acc() {
		System.out.println("BMW Accelarate");
		
	}

	@Override
	void stop() {
		System.out.println("BMW Stop");
		
	}
	
}
class Benz extends Vehicle{

	@Override
	void start() {
		System.out.println("BENZ Start");
		
	}

	@Override
	void acc() {
		System.out.println("BENZ Accelarate");
	}

	@Override
	void stop() {
		System.out.println("BENZ Stop");
	}
	
}

class Driver{
	public static void  Drive(Vehicle v) {
		v.start();
		v.acc();
		v.stop();
	}
}
