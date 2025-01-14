package com.Encapsulation.Student;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student student = new Student("Alice", 20, "S101");

        
        student.displayDetails();

       
        student.setName("Bob");
        student.setAge(150); // Invalid age, setter handles validation
        student.setStudentId("S102");

        // Display updated details
        System.out.println("\nUpdated Student Details:");
        student.displayDetails();

	}

}
