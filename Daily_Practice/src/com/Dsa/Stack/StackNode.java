package com.Dsa.Stack;

public class StackNode {
	private Node first;
	private int count ;
	
	
	//push+++++++++++++++++++++++
	public boolean push(int ele) {
		if(first==null) {
			first=new Node(ele);
			count++;
			return true;
		}
		first=new Node(ele,first);
		count++;
		return true;
	}

	//++++++++++++++++++++++
	public int size() {
		return count;
	}
	//=====================
	public Object peek() {
		if(count==0) {
			return null;
		}
		return first.a;
	}
	//========================
	public Object pop() {
		if(count==0) {
			return null;
		}
		Node temp = first;
		first=first.next;
		count--;
		return temp.a;
	}
	
	public void display() {
		Node curr=first;
		for(int i=0;i<count;i++) {
			System.out.println(curr.a);
			curr=curr.next;
		}
	}

}
