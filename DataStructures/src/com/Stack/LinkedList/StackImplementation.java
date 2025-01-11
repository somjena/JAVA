package com.Stack.LinkedList;

public class StackImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> l =new LinkedList<Integer>();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		int  i =l.pop();
		System.out.println("--------------------------Before-----------------------------");
		System.out.println(l.pop());
		System.out.println("---------------------------pop--------------------------------");
		System.out.println(l.Size());
		System.out.println(l.peek());
		System.out.println("---------------------------After-------------------------------");
		l.get();

	}

}
