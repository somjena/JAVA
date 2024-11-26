package com.Hashset.Integer;

public class User {

	public static void main(String[] args) {
		Hashset h = new Hashset();
		System.out.println(h.isEmpty());
		h.Add(10);
		h.Add(10);
		h.Add(20);
		h.Add(30);
		h.Add(40);
		
		h.traverse();
		System.out.println(h.size());		

	}

}
