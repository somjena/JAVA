package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class SatisfyGivenCondition {
	public static void main(String[] args) {
		List<Integer>l = Arrays.asList(-1,2,3,4,5);
		boolean check = l.stream().allMatch(i->i>0);
		System.out.println("All numbers are greater then five  :-" + check);
	}

}
