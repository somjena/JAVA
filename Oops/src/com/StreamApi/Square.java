package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
	public static void main(String[] args) {
		List<Integer>l=	Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list =l.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(list);
	}

}
