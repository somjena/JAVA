package com.Hashset.ObjectType.Student;


public class User {

	public static void main(String[] args) {
		Student s1 =new Student("Soumitra", 42);
		Student s2 =new Student("Soumitra", 42);
		Student s3 =new Student("Shrabana", 92);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		Hashset h= new Hashset();
		System.out.println(h.add(s1));
		System.out.println(h.add(s2));
		System.out.println(h.add(s3));
		
		h.traverse();
		

	}

}
