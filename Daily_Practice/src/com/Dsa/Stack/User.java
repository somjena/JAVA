package com.Dsa.Stack;

public class User {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.size());
		System.out.println("----------------------------");
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.size());
	}

}
