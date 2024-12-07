package com.Queue.Numbers;

import java.util.PriorityQueue;
import java.util.Queue;

public class SerialNumbers {

	public static void main(String[] args) {
		Queue <Integer> q = new PriorityQueue<Integer>(new EvenPrior());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
