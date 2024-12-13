package com.InnerClass.NonstaticInnerClass;

public class CarUser {

	public static void main(String[] args) {
		Car c1= new Car();
		Driver d1 = c1.driver();
		d1.drive();
	
		Car c2= new Car();
		Driver d2 = c2.driver();
		d2.drive();


	}

}
