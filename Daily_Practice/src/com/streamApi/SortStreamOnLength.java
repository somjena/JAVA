package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStreamOnLength {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("hi","helllo","bye","chalo");
		List <String> sort =l.stream().sorted((a,b)->b.length()-a.length()).collect(Collectors.toList());
		System.out.println(sort);
	}

}
