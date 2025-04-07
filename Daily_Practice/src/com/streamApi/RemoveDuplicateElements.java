package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,3,4,6,7,8);
		List<Integer>fresh = list.stream().distinct().collect(Collectors.toList());
		System.out.println(fresh);
	}

}
