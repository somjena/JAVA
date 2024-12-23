package com.Lambda_Expression.Programs;

import java.util.Arrays;

import java.util.List;

public class SortAlist {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rintu","Ankita","Simpul","Bablu");
		System.out.println(list);
		
		
        // Sort the list by length using a lambda expression
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by Length: " + list);
        

        // Optionally, sort alphabetically if needed
        list.sort(String::compareTo);
        System.out.println("Sorted Alphabetically: " + list);
    }
}
