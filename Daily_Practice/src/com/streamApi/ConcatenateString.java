package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class ConcatenateString {
	public static void main(String[] args) {
		String title = "Hey";
		List<String> l =Arrays.asList("Deepu","Lipu","Sinu","Minu");
		l.stream().forEach(i->System.out.println(title +" "+ i));
	}

}
