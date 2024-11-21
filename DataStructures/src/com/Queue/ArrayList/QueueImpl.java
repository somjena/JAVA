package com.Queue.ArrayList;

public class QueueImpl {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.Add(10);
		q.Add(20);
		q.Add(30);
		q.Add(40);
		q.Add(50);
		q.Add(60);
		q.get();
		System.out.println("---------------------before----------------------");
		q.poll();
		System.out.println("------------------------after------------------");
		q.get();
		System.out.println("-------------------------peek");
		System.out.println(q.peek());
	}

}
