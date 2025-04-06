package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindminMax {

	public static void main(String[] args) {
		List <Integer> l =Arrays.asList(1,2,3,4,5);
		
		Optional<Integer>max = l.stream().max(Comparator.naturalOrder());
		Optional<Integer>min= l.stream().min(Comparator.naturalOrder());
		System.out.println(max.orElseThrow(null));
		System.out.println(min.orElseThrow(null));

	}

}
