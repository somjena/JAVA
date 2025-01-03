package com.Abstraction.Vehicle;

class Driver{
	public static void  Drive(Vehicle v) {
		v.start();
		v.acc();
		v.stop();
	}
}