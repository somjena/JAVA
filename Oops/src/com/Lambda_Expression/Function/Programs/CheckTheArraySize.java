package com.Lambda_Expression.Function.Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CheckTheArraySize {

	public static void main(String[] args) {
		 List<int[]> l = Arrays.asList(new int[10],new int[20],new int[30],new int[40]);
		
		Function<int [], Integer> f = arr ->arr.length;
		//System.out.println(f.apply(new int[10]));
		
		for(int []a:l) {
			System.out.println(a.length);
			
		}

	}

}
