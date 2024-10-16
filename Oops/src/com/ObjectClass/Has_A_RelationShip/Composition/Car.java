package com.ObjectClass.Has_A_RelationShip.Composition;

public class Car {
	String name;
	String Model;
	String Colour;
	Engine e;
	public Car(String name, String model, String colour, Engine e) {
		this.name = name;
		Model = model;
		Colour = colour;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Car_Name :- "+name+"\n"+"Car_Model :-"+Model+"\n"+"Colour :- "+Colour+"\n"+"Engine_cc :-"+e;
	}
	
	
	
	

}
