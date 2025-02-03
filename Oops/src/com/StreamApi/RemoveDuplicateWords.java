package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateWords {
	static String res="";
	public static void main(String[] args) {
		String s = "java is java is very easy";
		String []str=s.split(" ");
		List<String>l=Arrays.asList(str);
		l.stream().distinct().forEach(i->res+=i+" ");
		System.out.println(res.trim());
	}

}
