package com.ObjectClass.equals;

class A {
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

       
        if (obj instanceof A) {
            A other = (A) obj;
           
            return this.a == other.a && this.b == other.b;
        }
        return false;
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A(10, 20);
        A obj2 = new A(10, 20);
        A obj3 = new A(30, 40);

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2)); 
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); 
    }
}
