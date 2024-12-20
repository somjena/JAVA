package com.Lambda_Expression.Predicate.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sumevenodd {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		Predicate <Integer> p = i -> i%2==0;
		int esum=0;
		int osum=0;
		for(int i :l) {
			if(p.test(i)) {
				esum+=i;
			}else
			osum+=i;
		}
		System.out.println("esum = "+esum+" osum = "+osum);

	}

}
