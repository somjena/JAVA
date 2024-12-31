package com.DataStructure.ArrayList;

public class User {
	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		System.out.println(i.add(10));
		System.out.println(i.add(20));
		//int res = i.get(0);
		//System.out.println(res);
		System.out.println(i.add(30, 1));
		i.Remove(1);
	
		for (int a = 0; a <i.size(); a++) {
		    if (!i.isEmpty()) {
		        System.out.println(i.get(a));
		    }
		}
		

	}

}
