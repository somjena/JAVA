package com.Encapsulation.Student;
//Student class
class Student {
 // Private fields
 private String name;
 private int age;
 private String studentId;
 
//Constructor
public Student(String name, int age, String studentId) {
   this.name = name;
   setAge(age); // Use setter to enforce validation
   this.studentId = studentId;
}

// Getter for name
public String getName() {
   return name;
}

// Setter for name
public void setName(String name) {
   this.name = name;
}

// Getter for age
public int getAge() {
   return age;
}

// Setter for age (with validation)
public void setAge(int age) {
   if (age > 0 && age <= 100) {
       this.age = age;
   } else {
       System.out.println("Invalid age. Setting default age to 18.");
       this.age = 18; // Default value for invalid input
   }
}

// Getter for studentId
public String getStudentId() {
   return studentId;
}

// Setter for studentId
public void setStudentId(String studentId) {
   this.studentId = studentId;
}

// Method to display student details
public void displayDetails() {
   System.out.println("Student Name: " + name);
   System.out.println("Age: " + age);
   System.out.println("Student ID: " + studentId);
}

 
}
