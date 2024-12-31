package com.DataStructure.ArrayList;

public class User {
	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		System.out.println(i.add(10));
		System.out.println(i.add(20));
		//int res = i.get(0);
		//System.out.println(res);
	
		for (int a = 0; a <i.size(); a++) {
		    if (!i.isEmpty()) {
		        System.out.println(i.get(a));
		    }
		}

	}

}
