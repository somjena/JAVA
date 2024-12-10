package com.Set.LinkedHashset.Car;

import java.util.LinkedHashSet;
import java.util.Set;

public class StoreCar {

	public static void main(String[] args) {
		Car c1 = new Car("BMW", new Engine(1200));
		Car c2 = new Car("BMW", new Engine(1200));
		Car c3 = new Car("BMW", new Engine(1200));
		Car c4 = new Car("BMW", new Engine(1200));
		
		
		Set<Car> s = new LinkedHashSet<Car>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		System.out.println(s);

	}

}
