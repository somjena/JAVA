package com.Queue.LinkedList;

public class LinkedList {
	private Node first;
	private int count;
	
	
	
	
	public void Add(Object ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
		}
		Node curr= first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(ele);
		count++;
	}
	

	
	
	public int Size() {
		return count;
	}

}
