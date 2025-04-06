package com.LambdaExpression;

public interface MathOperation {
	default void describe() {
	System.out.println("Perfoming MathOperation");
		
	}
	abstract int operate(int a,int b) ;

}