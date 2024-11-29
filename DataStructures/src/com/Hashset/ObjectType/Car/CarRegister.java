package com.Hashset.ObjectType.Car;

import com.Hashset.ObjectType.Hashset;

public class CarRegister {

	public static void main(String[] args) {
		
		Car c1=new Car("verna",201245,1);
		Car c2=new Car("verna",201245,1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
		
		Hashset h = new Hashset();
		h.add(c1);
		h.add(c2);
		h.traverse();
		



	}

}
