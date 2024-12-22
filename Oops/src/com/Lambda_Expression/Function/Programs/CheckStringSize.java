package com.Lambda_Expression.Function.Programs;

import java.util.function.Function;

public class CheckStringSize {

	public static void main(String[] args) {
		
		Function<String, Integer> getSize = f ->f.length();
		System.out.println(getSize.apply("rintu"));

	}

}
