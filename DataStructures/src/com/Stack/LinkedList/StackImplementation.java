package com.Stack.LinkedList;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l =new LinkedList();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.get();
		System.out.println("--------------------------Before-----------------------------");
		System.out.println(l.pop());
		System.out.println("---------------------------pop--------------------------------");
		System.out.println(l.Size());
		System.out.println(l.peek());
		System.out.println("---------------------------After-------------------------------");
		l.get();

	}

}
