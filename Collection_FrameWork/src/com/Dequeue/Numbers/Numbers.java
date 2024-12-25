package com.Dequeue.Numbers;

import java.util.ArrayDeque;
import java.util.Queue;

public class Numbers {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(50);
		q.add(40);
		q.add(30);
		q.remove();
	
		
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
