package com.Stack.NumberList;

import java.util.Stack;

public class NumberStack {

	public static void main(String[] args) {
		Stack<Integer> c= new Stack<Integer>();
		c.push(10);
		c.push(20);
		c.push(30);
		while(!c.isEmpty()) {
			System.out.println(c.pop());
		}
		System.out.println(c.isEmpty());
		System.out.println(c.peek());
		

	}

}
