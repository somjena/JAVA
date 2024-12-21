package com.Lambda_Expression.Function;

import java.util.function.Function;

public class MultiPly {

	public static void main(String[] args) {
		Function<Integer,Integer> f = n->n*n;
		System.out.println(f.apply(10));

	}

}
