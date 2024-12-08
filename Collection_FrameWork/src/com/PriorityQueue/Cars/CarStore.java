package com.PriorityQueue.Cars;

import java.util.PriorityQueue;
import java.util.Queue;

public class CarStore {

	public static void main(String[] args) {
		Car c1= new Car("BMW", new Engine(1200));
		Car c3= new Car("BENZ", new Engine(2400));
		Car c4 = new Car("ALTO", new Engine(700));
		Car c2= new Car("AUDI", new Engine(2200));
		
		
		
		
		Queue <Car>q = new PriorityQueue<Car>(new CC_Compare());
		q.add(c1);
		q.add(c2);
		q.add(c3);
		q.add(c4);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		

	}

}
