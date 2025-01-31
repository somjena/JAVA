package com.Map.SortedMap.Car;

import java.util.Comparator;

public class CarComp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}

}
