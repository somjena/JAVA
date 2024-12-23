package com.Lambda_Expression.Predicate.Car;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car("BMW", 1,new Engine(2200));
		Car c2 = new Car("AUDI", 2,new Engine(1800));
		Car c3 = new Car("MERCEDES", 3,new Engine(2100));
		Car c4 = new Car("DUCATI", 4,new Engine(4000));
		
		List<Car> list = Arrays.asList(c1,c2,c3,c4);
		Predicate<Car> p = c->c.e.cc>=2200;
		
		
		for(Car c:list) {
			if(p.test(c)) {
				System.out.println(c);
			}
		}

	}

}
