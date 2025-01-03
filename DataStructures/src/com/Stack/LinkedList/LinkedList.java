package com.Stack.LinkedList;

import java.util.EmptyStackException;

public class LinkedList {
	private Node first;
	private int count;
	
	
	
	public void push(Object o) {
		if(first==null) {
			first=new Node(o);
			count++;
			return;
		}
		Node temp=first;
		first=new Node(o);
		first.next=temp;
		count++;
		
	}
	public int Size() {
		return count;
	}
	
	
	
	public Object peek() {
		if(first==null) {
			throw new EmptyStackException();
		}
		return first.ele;
	}
	
	
	public Object pop() {
		if(first==null) {
			throw new EmptyStackException();
		}
		Node temp = first;
		first=first.next;
		count--;
		return temp.ele;
		
	}
	public void get() {
		Node curr=first;
		while (curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}

}
