package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDriver {
	public static void main(String[] args) {
	
		List <Emp> emplist=Arrays.asList(new Emp("Hrudesh", 20, 350.33),new Emp("Ankita", 22,750.36),new Emp("Kallu", 26, 970.30));
		
		
		emplist.stream().filter((Emp e)->e.age<30)
				.sorted((Emp e1,Emp e2)->e2.age-e1.age)
				.forEach((Emp e)->System.out.println(e.age + " "+e.sal));
	
	}

}
