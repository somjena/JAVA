package com.PriorityQueue.Emp;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StoreEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp("Som",201);
		Emp e2 = new Emp("Shrabana",202);
		Emp e3 = new Emp("Ankita",203);
		Emp e4 = new Emp("Bablu",204);
		
		
		Queue <Emp>q = new PriorityQueue<Emp>(new IdComparator());
		q.add(e1);
		q.add(e2);
		q.add(e3);
		q.add(e4);
		
		
		
		
        Iterator<Emp> i =q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}    
		
		
		//System.out.println(q.peek());
		/*while(!q.isEmpty()) {
			System.out.println(q.poll());
		}*/

	}

}
