package com.inheritance.Overriding;
class Animal{
	void makeSound() {
		System.out.println("Sound Of Animal");
	}
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Booowwww.....");
	}
	
}
class BabyDog extends Dog{
	@Override
	void makeSound() {
		System.out.println("Pew pew");
	}
}
class Monkey {
	
	void makeSounds() {
		System.out.println("Kheeeee...Khe.....");
	}
	
}
class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Mewwww......");
		
	}
}
public class AnimalDriver {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		BabyDog b1 = new BabyDog();
		b1.makeSound();
		Monkey m1 = new Monkey();
		// m1.makeSound();  // Because Monkey is Not A Type of animal
	}
	

}
