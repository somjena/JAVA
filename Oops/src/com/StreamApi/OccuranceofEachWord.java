package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceofEachWord {

	public static void main(String[] args) {
		String s = "java is java is very easy";
		String []str=s.split(" ");
		List<String>l=Arrays.asList(str);
		Map<Object,Long> m=l.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
		m.forEach((c,i)->System.out.println(c+"="+i));;
	}
}
