package com.DataStructure.LinkedList;

public class LinkedList <E>{
	private Node first;
	private int count;
	
	
	public boolean add(Object ele) {
		
		if(first==null) {
		first = new Node(ele);
		count++;
		return true;
		}
		
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		
		curr.next=new Node(ele);
		count++;
		return true;
	}

}
