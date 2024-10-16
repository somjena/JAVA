package com.ObjectClass.Has_A_RelationShip.Composition;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car("BMW", "XUV", "BLACK", new Engine(1000));
		System.out.println(c1);
		c1.e.cc=2000;
		System.out.println("______---------------_______");
		System.out.println(c1);

	}

}
