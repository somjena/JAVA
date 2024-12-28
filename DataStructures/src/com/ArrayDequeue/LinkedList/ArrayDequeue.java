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
	
	public Node peekFirst() {
		return first;
	}
	public Node peekLast() {
	    if (first == null) { // Check if the list is empty
	        return null;
	    }
	    Node temp = first;
	    while (temp.next != null) { // Traverse until the last node
	        temp = temp.next;
	    }
	    return temp; // Return the last node
	
	
	}
	
	public Object popFirst() {
		Object temp = first.ele;
		first=first.next;
		count--;
		return temp;
	}
	
	public void display() {
		Node temp =first;
		while(temp!=null) {
			System.out.println(temp.ele);
			temp=temp.next;
		}
	}

	

}
