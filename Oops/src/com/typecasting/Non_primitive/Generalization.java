package com.typecasting.Non_primitive;

class OLA{
	
	}

class Bike1 extends OLA{
	
}
class Car1 extends OLA{
	
}
class minicar extends Car1{
	
}

class Test1{
	public static void drive(OLA o) {
		System.out.println(o.getClass().getSimpleName()+" Driving");
	}
}
public class Generalization {

	public static void main(String[] args) {
		Test1.drive(new Bike1());
		Test1.drive(new minicar());
		Test1.drive(new Car1 ());
		Test1.drive(new OLA ());
		 
		

	}

}
