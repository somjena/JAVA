package com.Dsa.Queue;

public class QueueN {
	private Node first;
	private int count;
	
	public boolean add(int n) {
		if(first==null) {
			first=new Node(n);
			count++;
			return true;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(n);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public Object peek() {
		return first.ele;
	}
	
	public Object poll() {
		Node temp = first;
		first=first.next;
		count--;
		return temp.ele;
	}
	
	public void display() {
		Node curr = first;
		for(int i=0;i<size();i++) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}

}
