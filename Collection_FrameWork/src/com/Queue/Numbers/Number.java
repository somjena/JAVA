package com.Queue.Numbers;

import java.util.ArrayDeque;
import java.util.Queue;



public class Number {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.poll());
		
		while(!q.isEmpty()) {
		System.out.println(q.poll());
		}
		System.out.println(q.isEmpty());
		
		
		Queue<Integer> i = new ArrayDeque<Integer>();
		
		i.add(50);
		i.add(60);
		i.add(70);
		i.add(80);
		i.addAll(q);
		System.out.println(i);
		int n=i.poll();// For the Generic it will return the type Which User will give
		
		

	}

}
