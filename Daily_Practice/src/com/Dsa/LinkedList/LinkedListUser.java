package com.Dsa.LinkedList;

public class LinkedListUser {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		System.out.println(l.isEmpty());
		l.add(12);
		l.add(20);
		//System.out.println(l.remove(0));
		//System.out.println(l.remove(1));
		l.display();
		System.out.println(l.get(1));
		
	}

}
