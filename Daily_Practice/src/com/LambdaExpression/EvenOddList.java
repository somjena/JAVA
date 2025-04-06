package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddList {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(2,5,6,4,7,8,9);
		List<Integer> Evenlist =list.stream().sorted().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer>oddList = list.stream().sorted().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(Evenlist);
		System.out.println(oddList);
	}

}
