package com.PriorityQueue.Numbers;

import java.util.PriorityQueue;
import java.util.Queue;

public class Num {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>(new DescComparator());
		System.out.println(q.isEmpty());//true
		//Here we Insert the Value in the Mixed order  
		q.add(10);
		q.add(50);
		q.add(40);
		q.add(20);
		q.add(30);
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		while(!q.isEmpty()) {
			System.out.println(q.poll()); 
		}

	}

}
