package com.Hashset.ObjectType;

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
	public int hasCode() {
		return mark;
	}
	
	public boolean equals(Object e) {
		if(! (e instanceof Student))return false;
		Student s = (Student)e;
		
	}

}
