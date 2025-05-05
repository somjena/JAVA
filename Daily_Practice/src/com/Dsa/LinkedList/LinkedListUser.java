package com.Dsa.LinkedList;

public class LinkedListUser {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(40);
		l.add(50);
		l.display();
		System.out.println("---------------------");
		l.add(2, 30);
		l.display();
		
	}

}
