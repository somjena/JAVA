package com.Dequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	public static void main(String[] args) {
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		for(int n :list) {
			if(n%2==0) {
				a.addFirst(n);
			}
			a.addLast(n);
		}
		
	
	}

}
