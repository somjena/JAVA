package com.Lambda_Expression.Predicate.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenOdd {

	public static void main(String[] args) {
		
		List <Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> p = i -> i%2==0;
		
		for(int n :l) {
			if(p.test(n)) {
				System.out.println(n);
			}
		}
	

	}

}
