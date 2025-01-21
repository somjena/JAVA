package com.Abstraction.Vehicle;

public class Riding {

	public static void main(String[] args) {
        
		Driver.Drive(new BMW());
		System.out.println("----------------");
		Driver.Drive(new Benz());
		System.out.println("----------------");
		Driver.Drive(new Audi());
	}

}
