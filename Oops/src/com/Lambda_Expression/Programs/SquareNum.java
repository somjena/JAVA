package com.Lambda_Expression.Programs;
@FunctionalInterface
interface square<E>{
	int sqr(int i);
}
public class SquareNum {
	public static void main(String[] args) {
		
		
		square <Integer>s = i ->(i*i);
	 System.out.println(s.sqr(5));	
		
	}

}
