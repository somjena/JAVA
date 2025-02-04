package com.reference.MethodReference;

import java.util.function.Function;

public class Squarecheck {

	public static void main(String[] args) {
	//Through Lambda Expression	
		Function<Integer, Integer> fn =i->i*i;
		System.out.println(fn.apply(10));
		
	//Static Method Reference
		Function<Integer, Integer> f = Square::numsqr;
		System.out.println(f.apply(2));
		
		
		



	}

}
