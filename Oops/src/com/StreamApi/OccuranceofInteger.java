package com.StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceofInteger {

	public static void main(String[] args) {
	
		int []a = {1,2,3,1,2,3};
		Map <Object , Long>m =Arrays.stream(a).mapToObj(i->i).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(m);

	}

}
