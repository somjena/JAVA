package com.DataStructure.LinkedList;

public class User {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		/*
		System.out.println(l.add(10));
		System.out.println(l.add(20));
		System.out.println(l.add(30));
		System.out.println(l.add(40));
		System.out.println(l.size());
		System.out.println(l.isEmpty());*/
		//------------------------------------//
		Emp e1 = new Emp("som", 22);
		Emp e2 = new Emp("Rj",24);
		LinkedList<Emp> elm = new LinkedList<Emp>();
		elm.add(e1);
		elm.add(e2);
		//System.out.println(elm.get(0));
		
		//int res =l.get(3);
		//System.out.println(res);
		elm.display();
	

	}

}
