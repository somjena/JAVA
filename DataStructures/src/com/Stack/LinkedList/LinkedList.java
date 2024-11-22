package com.Stack.LinkedList;

public class LinkedList {
	private Node first;
	private int count;
	
	
	
	public void push(Object o) {
		if(first==null) {
			first=new Node(o);
			count++;
			return;
		}
		Node temp=new Node(o);
		first=new Node(o);
		first.next=temp;
		count++;
		
	}
	public int Size() {
		return count;
	}

}
