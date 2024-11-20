package com.LinkedList.SinglyLinkedList;

public class NodeImpl {

	public static void main(String[] args) {
		//Node first =null;
		/*
		first =new Node(10);
		first.next=new Node(20);
		first.next.next=new Node(30);
		first.next.next.next=new Node(40);
		
		
		
		Node curr=first;
		
		while(curr!=null) {
			System.out.println(curr.o);
			curr=curr.next;
		}
		
*/
		LinkedList l = new LinkedList();
		l.Add(10);
		l.Add(20);
		l.Add(30);
		l.Add(40);
		l.Add(50);
		l.Remove(3);
		l.Display();
		
		//System.out.println(l.size());
		//System.out.println(l.get(5));
		
		
		
		
	}

}
