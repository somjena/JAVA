package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterEvenfromList {

	public static void main(String[] args) {
		List<Integer> l =Arrays.asList(2,3,4,5,6);
		l.stream().filter(i->i%2==0).forEach(i->System.out.println(i));

	}

}
