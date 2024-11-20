package com.LinkedList.DoublyLinkedList;

public class Node {
	Object ele;
	Node next;
	Node prev;
	
	public Node(Object ele) {
		this.ele=ele;
	}
	public Node(Object e, Node p,Node n) {
		ele=e;
		prev =p;
		next=n;
	}

}
