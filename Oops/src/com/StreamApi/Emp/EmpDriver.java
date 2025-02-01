package com.StreamApi.Emp;

import java.util.Arrays;
import java.util.List;

public class EmpDriver {

	public static void main(String[] args) {
		Emp e1 = new Emp("Som", 24, 'M');
		Emp e2 = new Emp("Ankita", 22, 'F');
		Emp e3 = new Emp("Bablu", 20, 'M');
		Emp e4 = new Emp("Puchu", 24, 'F');
		Emp e5 = new Emp("poppy", 26, 'M');
		Emp[]emp = {e1,e2,e3,e4,e5};
		List <Emp> l =Arrays.asList(emp);
		long total=l.stream().count();
		long male = l.stream().filter(i->i.gender=='M').count();
		System.out.println("Male Count:"+male);
		System.out.println("Female Count:"+(total-male));
		

	}

}
