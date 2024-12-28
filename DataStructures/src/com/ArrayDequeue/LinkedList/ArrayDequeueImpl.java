package com.ArrayDequeue.LinkedList;

public class ArrayDequeueImpl {

	public static void main(String[] args) {
		ArrayDequeue a = new ArrayDequeue();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		//a.popFirst();
		//System.out.println(a.size());
		//System.out.println(a.popFirst());
		//a.display();
		System.out.println(a.popLast());
		System.out.println(a.size());

	}

}
