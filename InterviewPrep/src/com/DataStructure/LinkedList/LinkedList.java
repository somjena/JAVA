package com.DataStructure.LinkedList;

public class LinkedList <E>{
	private Node first;
	private int count;
	
	//Add Method
	public boolean add(E ele) {
		
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
	//Size Method
	public int size() {
		return count;
	}
	
	// isEmpty Method
	public boolean isEmpty() {
		return count==0;
	}

}
