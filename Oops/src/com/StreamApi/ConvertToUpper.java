package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpper {

	public static void main(String[] args) {
		List <String> l = Arrays.asList("ram","sita","shyam","ghan");
		l.stream().map(i->i.toUpperCase()).sorted().forEach(i->System.out.println(i));

	}

}
