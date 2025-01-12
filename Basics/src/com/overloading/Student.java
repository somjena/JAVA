package com.overloading;

class Student {
    private String name;
    private int age;
    private String grade;
    
   
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

   
    public void displayDetails(String name) {// Overload Method with One Argument
        System.out.println("Name: " + name);
    }

  
    public void displayDetails(String name, int age) {//Overload Method with Two Argument
        System.out.println("Name: " + name + ", Age: " + age);
    }

    
    public void displayDetails(String name, int age, String grade) {//Overload Method With Three Argument
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}