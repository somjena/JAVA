package com.Lambda_Expression.Function.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SquareofListEvenorOdd {

	public static void main(String[] args) {
		List <Integer> num = new ArrayList<Integer>();
		List<Integer> l =	Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, Integer> f = n->n*n;
		for(int n :l) {
			int sqr=f.apply(n);
			num.add(sqr);
		}
		
		
		Predicate<Integer> p = n->n%2==0;
		
		for(int n :num) {
			if(p.test(n)) {
				System.out.println(n);
			}
		}

	}

}
