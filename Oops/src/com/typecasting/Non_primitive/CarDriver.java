package com.typecasting.Non_primitive;
class Vehicle{
	
}
class BMW extends Vehicle{
	
}
class Audi extends Vehicle{
	
}
class Benz extends Vehicle{
	
}
class ride{
	public static void bookride(Vehicle v) {
		System.out.println(v.getClass().getSimpleName() + " Riding");
		
	}
	
}
public class CarDriver {

	public static void main(String[] args) {
		ride.bookride(new BMW());
		ride.bookride(new Audi());
		ride.bookride(new Benz());

	}

}
