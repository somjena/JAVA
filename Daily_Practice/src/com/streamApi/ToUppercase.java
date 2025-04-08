package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class ToUppercase {

	public static void main(String[] args) {
		List <String>l =Arrays.asList("muna","dina","chuna","luna");
		l.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));

	}

}
