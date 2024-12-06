package com.Queue.Cars;

import java.util.LinkedList;
import java.util.Queue;

public class StoreCars {

	public static void main(String[] args) {
		Car c1 = new Car("Verna", new Engine(1200));
		Car c2 = new Car("BMW", new Engine(2200));
		Car c3 = new Car("Audi", new Engine(2800));
		System.out.println(c1);
		
		
		Queue<Car> q = new LinkedList<Car>();
		q.add(c1);
		q.add(c2);
		q.add(c3);
		System.out.println(q);
		System.out.println(q.isEmpty());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		

	}

}
