package com.Dsa.Queue;
public class User {

public static void main(String[] args) {
	Queue q=  new Queue();
	q.add(10);
	q.add(20);
	System.out.println(q.peek());
	System.out.println(q.size());
	System.out.println(q.poll());
	System.out.println(q.size());
	
	System.out.println(q.poll());
	
	
	}

}
