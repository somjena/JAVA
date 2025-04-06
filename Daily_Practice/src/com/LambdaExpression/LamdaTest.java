package com.LambdaExpression;

public class LamdaTest {

	public static void main(String[] args) {
		MathOperation sum = (a,b)->a+b;
		sum.describe();
		System.out.println(sum.operate(2, 2));
		MathOperation mult = (a,b)->a*b;
		mult.describe();
	    System.out.println(mult.operate(5, 2));
	}
}
