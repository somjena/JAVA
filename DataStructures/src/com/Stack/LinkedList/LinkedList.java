package com.Stack.LinkedList;

import java.util.EmptyStackException;

public class LinkedList <E>{
	private Node first;
	private int count;
	
	
	//push method
	public void push(E  o) {
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
	//Size Method
	public int Size() {
		return count;
	}
	
	
	//peek method
	public Object peek() {
		if(first==null) {
			throw new EmptyStackException();
		}
		return first.ele;
	}
	
	//pop method
	public E pop() {
		if(first==null) {
			throw new EmptyStackException();
		}
		Node temp = first;
		first=first.next;
		count--;
		return (E) temp.ele;
		
	}
	
	//get method
	public void get() {
		Node curr=first;
		while (curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}

}
