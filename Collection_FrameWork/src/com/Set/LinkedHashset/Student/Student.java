package com.Set.LinkedHashset.Student;

public class Student {
	String name;
	int mark;
	int sec;
	
	
	public Student(String name, int mark, int sec) {
		this.name = name;
		this.mark = mark;
		this.sec = sec;
	}
	
	@Override
	public String toString() {
		return "Name -"+name+" Mark -"+mark+" sec -"+sec;
	}
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		return this.name.equals(s.name) && this.mark==s.mark && this.sec==s.sec;
	}
	
	@Override
	public int hashCode() {
		return name.charAt(0);
	}
	
	
	

}
