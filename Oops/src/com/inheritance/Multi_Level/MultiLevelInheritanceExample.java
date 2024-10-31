package com.inheritance.Multi_Level;


class Person {
    String name;
    int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    String studentId;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        displayDetails();
        System.out.println("Studentdata ID: " + studentId);
    }
}

class EngineeringStudent extends Student {
    String specialization;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayEngineeringStudentInfo() {
        displayStudentInfo();
        System.out.println("Specialization: " + specialization);
    }
}


public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        EngineeringStudent engStudent = new EngineeringStudent();
        
        engStudent.setDetails("John Doe", 20);
        engStudent.setStudentId("S12345");
        engStudent.setSpecialization("Computer Science");

        System.out.println("Engineering Studentdata Information:");
        engStudent.displayEngineeringStudentInfo();
    }
}
