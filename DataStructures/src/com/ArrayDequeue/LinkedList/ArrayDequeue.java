package com.ArrayDequeue.LinkedList;


public class ArrayDequeue {

	private Node first;
	private int count;
	
	
	public void push(Object ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
			return;
			
		}
		Node temp=first;
		first=new Node(ele);
		first.next=temp;
		count++;

	}
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}

	

}
