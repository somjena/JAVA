package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class Countthenumberofelements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		long l =list.stream().count();
		System.out.println(l);

	}

}
