package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FirstElement {

	public static void main(String[] args) {
		List<Integer>l = Arrays.asList(1,2,3,4,5);
		Optional<Integer> first =l.stream().findFirst();
		System.out.println(first.orElseThrow(null));
		
		

	}

}
