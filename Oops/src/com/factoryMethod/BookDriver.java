package com.factoryMethod;

import java.util.Scanner;

class Book{
	String name;
	String author;
	double price;
public Book(String name,String author,double price) {
	this.name=name;
	this.author=author;
	this.price=price;
}
public void display() {
	System.out.println("name = "+name +"\n"+"author_name = "+author+"\n"+"Price = "+price);
}
public static  Book createbook() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Book Details");
	String name = sc.nextLine();
	String Author = sc.nextLine();
	double price = sc.nextDouble();
	return new Book(name,Author,price);
	
}
}
public class BookDriver {

	public static void main(String[] args) {
		Book b1 = Book.createbook();
		b1.display();
		

	}

}
