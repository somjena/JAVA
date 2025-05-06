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
		//l.Add(101, 1);
		l.Add(10);
		l.Add(20);
		l.Add(30);
		l.Add(40);
		l.Add(50);
		
	System.out.println(l.size());
		//l.Add(60,5);
		//l.Add(70, 2);
	
		//l.Ree(3);
		//l.Display();
		
		
		//System.out.println(l.size());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		
		
		
	}

}
