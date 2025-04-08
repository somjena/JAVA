package com.Array;

public class User {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		System.out.println(l.add(10));
		l.add(20);
		l.add(30);
		l.display();
		l.remove(0);
		l.display();
		System.out.println(l.size());
	}

}
