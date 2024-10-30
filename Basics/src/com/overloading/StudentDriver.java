package com.overloading;
import java.util.*;
class Student {
    private String name;
    private int age;
    private String grade;
    
   
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

   
    public void displayDetails(String name) {
        System.out.println("Name: " + name);
    }

  
    public void displayDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    
    public void displayDetails(String name, int age, String grade) {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter student's age: ");
        int age = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("Enter student's grade: ");
        String grade = sc.nextLine();

       
        Student student = new Student(name, age, grade);

        System.out.println("\nDisplaying details using overloaded methods:");
        
       
        student.displayDetails(name);               // Display name only
        student.displayDetails(name, age);          // Display name and age
        student.displayDetails(name, age, grade);   // Display name, age, and grade
        
        sc.close();
    }
}
