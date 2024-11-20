package com.LinkedList.SinglyLinkedList;

public class LinkedList {
	private Node first;
	private int count;
	
	
	public String Add(Object o) {
		if(first==null) {
			first=new Node(o);
			count++;
			return "SuccessFully Added  "+o+" At pos :- "+1;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(o);
		count++;
		return "SuccessFully Added to the "+count+" "+o;
		
	}
	public String Add(Object ele,int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(ele,first);
			count++;
			return "Created Node at:-"+count+" "+ele;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(ele,curr.next);
		count++;
		return "Created Node at:-"+count+" "+ele;
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		if(index<=-1||index>=count) {
			throw new IndexOutOfBoundsException();
		}
		Node curr =first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		return curr.o;
	}
	public void Display() {
		Node curr = first;
		for(int i=0;i<size();i++) {
			System.out.println(curr.o);
			curr=curr.next;
		}
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
	}
