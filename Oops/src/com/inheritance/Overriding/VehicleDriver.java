package com.inheritance.Overriding;
class Vehicle{
	void Start() {
		System.out.println("Vehicle is Started");
	}
}
class Bike extends Vehicle{
	@Override
	void Start() {
		System.out.println("Bike Started");
	}
}

class VehicleCreator{
	public static void Drive(Object o) {
		((Vehicle) o).Start();

		System.out.println(o.getClass().getSimpleName() + " Driving"+"\n");
		
		
	}
	
}
public class VehicleDriver {

	public static void main(String[] args) {
		VehicleCreator.Drive(new Bike());
          
		 

	}

}
