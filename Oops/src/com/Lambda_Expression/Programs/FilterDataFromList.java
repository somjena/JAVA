package com.Lambda_Expression.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterDataFromList {

	public static void main(String[] args) {
		List<Integer> l =Arrays.asList(1,2,3,4,5,6,7,8,9);
		List <Integer>evenList = new ArrayList<Integer>();
		List <Integer>oddList = new ArrayList<Integer>();
		
		Predicate<Integer> p = n->n%2==0;
		
		for(int n:l) {
			if(p.test(n)) {
				evenList.add(n);
				
			}else {
				oddList.add(n);
			}
		}
		System.out.println(evenList);
		System.out.println(oddList);

	}

}
