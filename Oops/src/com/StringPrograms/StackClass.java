package com.StringPrograms;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push('a');
		st.push('b');
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		

	}

}
