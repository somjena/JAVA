package com.LinkedList.ImpementationWithGeneric;

public class LinkedList <E>{
	private Node first;
	private int count;
	
	
	
	public void add(E e) {
		if(first==null) {
			first =new Node(e);
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		
	}

}
