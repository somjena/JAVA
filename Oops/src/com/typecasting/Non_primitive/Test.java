package com.typecasting.Non_primitive;
class Vehiclex{
	void ride() {
		System.out.println("Vehicle Started");
	}
}
class Bike extends Vehiclex{
	void ride() {
		System.out.println("Bike Started");
		
	}
	
	void acc() {
		System.out.println("Bike Speed Up");
	}
}
class cycle extends Bike{
	void ride() {
		System.out.println(" Cycle Start");
	}
	void padel(){
		System.out.println("Start Padelling");
	}
}
public class Test {

	public static void main(String[] args) {
	
		Vehiclex v = new cycle();
		v.ride();
		
		Bike b1 =new cycle();
		b1.acc();
		b1.ride();

	}

}