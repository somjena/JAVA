package com.Set.LinkedHashset.Student;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StoreStudent {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Soumitra", 45, 1);
		Student s2 = new Student("Soumitra", 45, 1);
		Student s3 = new Student("Soumitra", 45, 1);
		
		
		
		
		Set <Student> s = new LinkedHashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		Iterator<Student> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
