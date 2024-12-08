package com.PriorityQueue.Cars;

import java.util.Comparator;

public class CC_Compare implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o2.e.cc-o1.e.cc;
	}

}
