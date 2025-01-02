package com.Abstraction.Vehicle;

abstract public class Vehicle {
	 abstract void start();
	 abstract void acc();
	 abstract void stop();

}

class Driver{
	public static void  Drive(Vehicle v) {
		v.start();
		v.acc();
		v.stop();
	}
}
