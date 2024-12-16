package com.Map.SortedMap.Car;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StoreCar {

	public static void main(String[] args) {
		Map<Integer,Car> m = new TreeMap<Integer,Car>();
		m.put(1011, new Car("BMW", new Engine(1200)));
		m.put(1012, new Car("AUDI",new Engine(1400)));
		m.put(1013, new Car("BENZ",new Engine(1400)));
		m.put(1014, new Car("MERCEDES",new Engine(1400)));
		Set s = m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(m.get(i.next()));
		}

	}

}
