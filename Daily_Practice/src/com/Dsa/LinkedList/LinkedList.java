package com.Dsa.LinkedList;

public class LinkedList {
	private Node first;
	private int count;
	
	//Add Method Of Linked List
	public boolean add(Object ele) {
		if(first==null) {
		first=new Node(ele);
		count++;
		return true;
		}
		Node curr =first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next =	new Node(ele);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	//Add Overload Method 
	public boolean add(int index ,Object ele) {
		if(index<=-1|| index >=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(ele,first);
			count++;
			return true;
		}
		Node curr = first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(ele);
		count++;
		return true;
		
	}

}
