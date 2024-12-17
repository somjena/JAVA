package com.Map.HashMap.Mobile;

import java.util.HashMap;
import java.util.Map;

public class StorePhone {

	public static void main(String[] args) {
	Map<Integer, Phone> p = new HashMap<Integer, Phone>();
	
	;
	p.put(1, new Phone(128, 8, "OPPO"));
	p.put(1, new Phone(128, 8, "OPPO"));
	p.put(1, new Phone(128, 8, "OPPO"));
	p.put(1, new Phone(128, 8, "OPPO"));
	for(Map.Entry<Integer, Phone> entry:p.entrySet()) {}
	

	}

}
