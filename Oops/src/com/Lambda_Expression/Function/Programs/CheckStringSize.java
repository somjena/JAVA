package com.Lambda_Expression.Function.Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CheckStringSize {

	public static void main(String[] args) {
		List<String> l  = Arrays.asList("Som","Bablu","pintu","rintu");
		
		Function<String, Integer> getSize = f ->f.length();
		
		for(String s :l) {
			System.out.println("______"+s+"______"+ " size is "+getSize.apply(s));
		}

	}

}
