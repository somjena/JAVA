package com.Dsa.Stack;

public class ImplnodeStack {
	public static void main(String[] args) {
		StackNode st = new StackNode();
		st.push(10);
		st.push(20);
		st.display();
		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.pop();
		System.out.println("==========================");
		st.display();
		System.out.println(st.pop());
		System.out.println(st.size());
	}

}

