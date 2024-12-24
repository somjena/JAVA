package com.Dequeue.Numbers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenNumbers {
	public static void main(String[] args) {
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		for(int n :list) {
			if(n%2==0) {
				a.addFirst(n);
			}else
			a.addLast(n);
		}
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
	
		Iterator<Integer> itr=a.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}

}
