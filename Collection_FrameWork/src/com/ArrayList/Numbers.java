package com.ArrayList;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		//c.add("Som");
		System.out.println(c.add(40));
		System.out.println(c.get(0));
		c.remove(0);
		System.out.println(c.get(0));
		
		
		

	}

}
