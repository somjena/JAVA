package com.ArrayList.ImpementationWithGeneric;

public class User {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(40);
		//int e=a.get(0);
		//System.out.println(e);
		a.add(30,1);
		//System.out.println(a.get(1));
		a.traverse();
	}

}
