package com.List.Student;

public class Student implements Comparable<Student>{
	String name;
	int rollno;
	double mark;
	
	public Student(String name,int rollno,double mark) {
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;
	}
	@Override
	public String toString() {
		return "name= "+name+" rollno "+rollno+" mark= "+mark;
	}

	@Override
	public int compareTo(Student o) {
		return o.rollno-rollno;
	}
}
