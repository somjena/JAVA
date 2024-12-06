package com.Stack.Student;

import java.util.Stack;

public class StoreStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Soumitra jena", 1, 92);
		Student s2 = new Student("Pabitra jena", 2, 88);
		Student s3 = new Student("Ajit jena", 3, 46);
		Student s4 = new Student("Amit jena", 4, 15);
		
		Stack<Student> s = new Stack<Student>();
		s.push(s1);
		s.push(s2);
		s.push(s3);
		s.push(s4);
		//System.out.println(s);
		System.out.println("Peek Object"+s.peek());
		System.out.println(s.isEmpty());
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		

	}

}
