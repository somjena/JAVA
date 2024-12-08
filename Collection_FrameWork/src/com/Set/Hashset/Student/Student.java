package com.Set.Hashset.Student;

public class Student {
	String name;
	int rollno;
	
	
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	@Override
	public String toString() {
		return "name:--"+name+" "+" rollno:--"+rollno;
	}
	
	@Override
	public int hashCode() {
		return name.charAt(0);
	}
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		return this.name.equals(s.name)&&this.rollno==s.rollno;
	}

}
