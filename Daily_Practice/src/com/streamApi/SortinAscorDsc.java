package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortinAscorDsc {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,3,4,6,7,8);
	List Desc=list
			.stream()
			.distinct()
			.sorted((a,b)->b-a)
			.collect(Collectors.toList());
	
	List Asc = list.stream().distinct().sorted().collect(Collectors.toList());
	
	
	System.out.println(Desc);
	System.out.println(Asc);
	
}
}
