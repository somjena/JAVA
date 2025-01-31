package com.Lambda_Expression.Consumer;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		String []s = {"sql","java","c++","html","css"};
		
		//Creating Lambda Expression For make this each Element Upper Case
		Consumer<String> cs = i->System.out.println( i.toUpperCase());
		for(String st :s) {
			cs.accept(st);
			
		}

	}

}
