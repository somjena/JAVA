package com.Abstraction.Vehicle;

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
