package com.Map.HashMap.Emp;

import java.util.HashMap;
import java.util.Map;

public class StoreEmp {

	public static void main(String[] args) {
		Map<Integer, Emp> e1 = new HashMap<Integer, Emp>();
		e1.put(1, new Emp("Ankitaa", 1));
		e1.put(1, new Emp("Rintu", 1));
		e1.put(1, new Emp("Ankitaa", 1));
		e1.put(1, new Emp("Ankitaa", 1));
	
		

	}

}
