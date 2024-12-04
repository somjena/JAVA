package com.LinkedList.ImpementationWithGeneric;

public class LinkedList <E>{
	private Node first;
	private int count;
	
	
	
	public boolean add(E e) {
		if(first==null) {
			first =new Node(e);
			count++;
			return true;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e);
		count++;
		return true;
	}
	
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}

}
