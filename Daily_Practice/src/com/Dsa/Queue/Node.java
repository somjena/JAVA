package com.Dsa.Queue;

public class Node {
	Object ele;
	Node next;
	
	public Node(Object ele) {
		this.ele=ele;
		next=null;
	}
	public Node(Object ele,Node next) {
		this.ele=ele;
		this.next=next;
	}

}
