package com.Set.Hashset.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentStore {

	public static void main(String[] args) {
		Student s1 = new Student("Soumitra", 1);
		Student s2 = new Student("Ankita",2);
		Student s3 = new Student("Bablu",3);
		Student s4 = new Student("Soumitra", 1);
		
		
		
		Set<Student> s = new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println(s.add(s4)); // Here it Allows the Duplicate Values so we need to implement the Hashcode method and equals method in the Respected class
		//System.out.println(s);
		
		Iterator e=s.iterator();
		
		
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}

}
