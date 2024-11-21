package com.Queue.LinkedList;

public class LinkedList {
	private Node first;
	private int count;
	
	
	
	
	public void Add(Object ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
			return;
		}
		Node curr= first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(ele);
		count++;
	}
	
	public void get() {
		Node curr=first;
		for(int i=0;i<Size();i++) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	

	
	
	public int Size() {
		return count;
	}
	
	public Object peek() {
		if(first==null) {
			throw new IndexOutOfBoundsException();
		}
	return first.ele;
	}
	
	
	public Object poll() {
		if(first==null) {
			throw new IndexOutOfBoundsException();
		}
		Node temp =first;
		
		first=first.next;
		count--;
		return temp.ele;
		
	}
	

}
