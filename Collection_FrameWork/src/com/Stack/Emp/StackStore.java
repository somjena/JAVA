package com.Stack.Emp;

import java.util.Collections;
import java.util.Stack;

public class StackStore {

	public static void main(String[] args) {
		Emp e1 = new Emp("Soumitra", 1);
		Emp e2 = new Emp("Ankita", 2);
		Emp e3 = new Emp("Pabitra",3);
		
		
		Stack <Emp> s1 = new Stack<Emp>();
		s1.push(e1);
		s1.push(e2);
		s1.push(e3);
		while(!s1.isEmpty()) {
		System.out.println(s1.pop());
		}
		System.out.println(s1.isEmpty());
		//System.out.println(s1.peek());--> Exception Because When there is No Element or Object the Stack will Throw Exception
	}

}
