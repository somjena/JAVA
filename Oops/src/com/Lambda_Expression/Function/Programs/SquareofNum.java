package com.Lambda_Expression.Function.Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SquareofNum {

	public static void main(String[] args) {
	List<Integer> l =	Arrays.asList(1,2,3,4,5,6,7,8,9);
	Function<Integer, Integer> f = n->n*n;
	
	
	
	for(int n :l) {
		System.out.println(f.apply(n));
		
	}
	}

}
