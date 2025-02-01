package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
	List<Integer>l = Arrays.asList(1,2,3,4,1,2,3,4);
	List <Integer>list=l.stream().distinct().collect(Collectors.toList());
	System.out.println(list);

	}

}
