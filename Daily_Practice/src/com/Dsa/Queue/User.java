package com.Dsa.Queue;
public class User {

public static void main(String[] args) {
//	Queue q=  new Queue();
//	q.add(10);
//	q.add(20);
//	System.out.println(q.peek());
//	System.out.println(q.size());
//	System.out.println(q.poll());
//	System.out.println(q.size());
//	
//	System.out.println(q.poll());
//	System.out.println(q.size());
//	System.out.println(q.poll());
	
	
	
	QueueN n = new QueueN();
	n.add(10);
	n.add(20);
	n.add(30);
	n.add(40);
	n.add(50);
	System.out.println(n.poll());
	System.out.println(n.size());
	n.display();
	
	
	}

}
