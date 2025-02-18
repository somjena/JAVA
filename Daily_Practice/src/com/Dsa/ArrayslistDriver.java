package com.Dsa;

public class ArrayslistDriver {
	public static void main(String[] args) {
		ArrayList<Integer>a= new ArrayList<Integer>();;
		System.out.println(a.isEmpty());
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(2, 40);
		a.Remove(2);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.traverse();
		int res = a.get(1);
		System.out.println(res);
	}

}
