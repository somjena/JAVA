package com.Lambda_Expression.Predicate.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrinttheGreaterName {

	public static void main(String[] args) {
		
		List <String> l =Arrays.asList("Rintu","Bablu","Ankita","Shrabana","Pabitra");
		
		Predicate<String> p = i -> i.length()>6;
		
		
		for(String s :l) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}

	}

}
