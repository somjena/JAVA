package com.Lambda_Expression.Programs;


@FunctionalInterface
interface I{
	void view(int i);
}



public class Print {

	public static void main(String[] args) {
		I i = a->System.out.println(a);
		i.view(15);
		i.view(15);
		 
	}

}
