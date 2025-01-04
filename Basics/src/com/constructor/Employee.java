package com.constructor;

public class Employee {
	public static void main(String[] args) {
		RegisterEmp e1 = new RegisterEmp("Som", 22, 5.6);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.height);
	}

}
