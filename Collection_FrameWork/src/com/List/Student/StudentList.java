package com.List.Student;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class StudentList {

	public static void main(String[] args) {
		Student s1 = new Student("Chef", 1, 43);
		Student s2= new Student("Ballu", 2, 96);
		Student s3 = new Student("Ankita",3,99);
		
		
		List l =new LinkedList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		System.out.println(l);
		Collections.sort(l, new NameComparator());
		System.out.println(l);
		System.out.println(l.get(0).getClass().getSimpleName());
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
