package com.StreamApi.Emp;

public class Emp {
	String name;
	int age;
	char gender;
	
	public Emp(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
