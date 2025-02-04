package com.reference.InstanceMethodReference;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class EvenCheck {

	public static void main(String[] args) {
		Num n = new Num();
		Predicate<Integer> p = n::isEven;
		System.out.println(p.test(10)); 
		Consumer<String> c= n::printData;
		c.accept("Hello");
		

	}

}
