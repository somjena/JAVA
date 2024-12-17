package com.Map.HashMap.Mobile;

import java.util.HashMap;
import java.util.Map;



public class StorePhone {

	public static void main(String[] args) {
		Phone p1 = new Phone(128, 12, "Vivo");
		p1.insertSim(new Sim("Jio"));
		Phone p2 = new Phone(128, 12, "Oppo");
		p2.insertSim(new Sim("Airtel"));
		
		
		
	Map<Integer, Phone> p = new HashMap<Integer, Phone>();
	
	;
	p.put(1, p1);
	p.put(2, p2);
	
	for(Map.Entry<Integer, Phone> entry:p.entrySet()) {
		System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	}
	}

}
