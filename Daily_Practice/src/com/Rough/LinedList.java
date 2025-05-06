package com.Rough;

import java.util.EmptyStackException;

public class LinedList {
	private Node first;
	private int count;
	
	//add Method
	public boolean push(Object ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
			return true;	
		}
		first=new Node(ele,first);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	
	public void Display() {
		Node Curr = first;
		
		for(int i=0;i<size();i++) {
			System.out.print(Curr.ele+" ");
			Curr=Curr.next;
		}
	}
	//peek Method
	public Object peek() {
		if(count==0) {
			throw new EmptyStackException();
		}
		return first.ele;
	}
	public Object pop() {
		if(count==0) {
			throw new EmptyStackException();
		}
		Node curr=first;
		first=first.next;
		count--;
		return curr.ele;
	}

}
