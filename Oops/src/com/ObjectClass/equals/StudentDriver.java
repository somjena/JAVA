package com.ObjectClass.equals;
class Student{// Student class
	String name;
	int age;
	double dob;
	Student(String name,int age,double dob){
		this.name=name;
		this.age=age;
		this.dob=dob;
	}
	@Override
	public String toString() {
		return "name:-"+name+"\n"+"age:-"+age+"\n"+"dob:-"+dob;
		
	}
	public boolean equals(Object o) {
		Student s =(Student)o;
		return this.name.equals(s.name)&& this.age==s.age && this.dob==s.dob;
	}
}
public class StudentDriver {

	public static void main(String[] args) {
		Student s1= new Student("Som",22,22.24);
		Student s2= new Student("Som",22,22.24);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));

	}

}
