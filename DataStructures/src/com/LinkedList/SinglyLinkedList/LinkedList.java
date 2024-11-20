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

}
