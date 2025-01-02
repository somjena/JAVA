package com.Abstraction;

class Employ extends Person {

    Employ(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }
}

