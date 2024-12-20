package com.Lambda_Expression.Programs;
@FunctionalInterface
interface Add{
	int add(int i, int j);
	
}
public class TwoDifferentNumAdd {

	public static void main(String[] args) {
		Add a = (i,j) -> (i+j);
		System.out.println(a.add(10, 20)); 

	}

}
