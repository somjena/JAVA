package com.Hashset.ObjectType.Student;

public class Student {
	String name;
	int mark;
	
	public Student(String name,int mark) {
		this.name=name;
		this.mark=mark;
	}
	@Override
	public String toString() {
		return "StudentName= "+name+"____ mark="+mark;
	}
	@Override
	public int hashCode() {
		return mark;
	}
	@Override
	public boolean equals(Object e) {
		if(!(e instanceof Student))return false;
		Student s = (Student)e;
		return name.equals(s.name)&& mark==s.mark;
		
	}

}
