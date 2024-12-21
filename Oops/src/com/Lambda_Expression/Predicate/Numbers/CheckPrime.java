package com.Lambda_Expression.Predicate.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckPrime {

	public static void main(String[] args) {
		List <Integer> l =Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		Predicate<Integer> p = n-> {
			if(n<2)return false;
			for(int i = 2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
				}
			return true;
			};
			
			for(int n : l) {
				if(p.test(n)) {
					System.out.println( n+ "\t");
				}
			}
			
			
			
			
		}
	
	}


