package com.streamApi;


import java.util.Arrays;
import java.util.List;

public class FirstLetterUpeer {
	public static void main(String[] args) {
		//List <String>l= new ArrayList<String>();
		List<String> l=Arrays.asList("rintu","popi","puchu");
		
		l.stream().forEach(i->System.out.println(i.charAt(0)));
		
	}

}
