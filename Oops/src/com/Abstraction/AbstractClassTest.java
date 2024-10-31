package com.Abstraction;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    abstract void study();
}


class Employ extends Person {

    Employ(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }
}


public class AbstractClassTest {
    public static void main(String[] args) {
        Employ employ = new Employ("Alice", 20);
  
        employ.displayDetails();
   
        employ.study();
    }
}
