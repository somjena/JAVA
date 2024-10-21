package com.constructor;
class RegisterEmp{
	String name;
	int age;
	double height;
	
	public RegisterEmp(String name, int age, double height) {
		
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	
	
}
public class Employee {
	public static void main(String[] args) {
		RegisterEmp e1 = new RegisterEmp("Som", 22, 5.6);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.height);
	}

}
