package com.Stack.Student;

public class Student {
	String name;
	int rollno;
	double mark;
	
	
	public Student(String n,int r,double m) {
		this.name=n;
		this.rollno=r;
		this.mark=m;
	}
	@Override
	public String toString() {
		return "name= "+name+" rollno "+rollno+" mark = "+mark;
	}

}
