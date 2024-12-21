package com.Lambda_Expression.Programs;

import java.util.function.Predicate;

public class EmptyArrayCheck {

	public static void main(String[] args) {
		Predicate<int[]> isEmptyarr = arr -> arr.length>0;
		
		int[]a= {};
		int [] b= {1,2,3};
		System.out.println(isEmptyarr.test(a));
		System.out.println(isEmptyarr.test(b));

	}

}
