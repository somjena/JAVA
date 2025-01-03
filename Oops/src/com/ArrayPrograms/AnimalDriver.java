package com.ArrayPrograms;

interface Animal{//Animal Interface
	void makeSound();
}
class Dog implements Animal{// Dog Class

	@Override
	public void makeSound() {
		System.out.println("Bowwww.... Boww......");
		
	}
	void jump() {
		System.out.println("Jump......");
	}
	
}
class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Meoowww........");
		
	}
	
}
public class AnimalDriver {

	public static void main(String[] args) {
		Animal [] n=new Animal[4];
		n[0]=new Dog();
		n[1]=new Cat();
		n[2]=new Dog();
		n[3]=new Cat();
		for(Animal a:n) {
			a.makeSound();
			if(a instanceof Dog) {
				 Dog map=(Dog)a;
				 map.jump();
			}
		}

	}

}
