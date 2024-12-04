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
	
	public void Remove(int index) {
		if(index<=-1|| index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;


	}
	public void traverse() {
		Node curr=first;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
			
		}
	}

}
