package com.inheritance.ConstructorChaining;

class Vehicle{
	Vehicle(){
		System.out.println("Vehicle Class Constructor");
	}
}
class CarCompany extends Vehicle{
	CarCompany(){
		System.out.println("CarCompany Class Constructor");
	}
}
class BMW extends CarCompany{
	BMW(){
		System.out.println("Bmw Constructor");
	}
}
public class Demo {
	public static void main(String[] args) {
		new BMW();
		
	}

}
