package com.Abstraction.Vehicle;

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