package com.Dsa.LinkedList;

public class Node {
	Object o;
	Node next;
	public Node(Object o) {
		this.o=o;
		next=null;
	}
	public Node(Object o,Node next) {
		this.o=o;
		this.next=next;
	}

}
