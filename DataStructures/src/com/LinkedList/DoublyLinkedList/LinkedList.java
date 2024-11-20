package com.LinkedList.DoublyLinkedList;

public class LinkedList {
	private Node first;
	private int count;
	
	
	
	public void Add(Object o) {
		if(first==null) {
			first=new Node(o);
			count++;
			return;
		}
		Node curr = first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(o,curr,null);
		count++;
		return;
	}

}
