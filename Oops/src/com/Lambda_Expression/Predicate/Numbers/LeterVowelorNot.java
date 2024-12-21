package com.Lambda_Expression.Predicate.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class LeterVowelorNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Letter");
		char c= sc.next().charAt(0);
		List<Character> l = Arrays.asList('A','E','I','O','U');
		
		Predicate<Character> p = i->l.contains(i);
		if(p.test(c)) {
			System.out.println(c + " Is A Vowel");
		}else {
			System.out.println(c + " Is Not A Vowel");
		}

	}

}
