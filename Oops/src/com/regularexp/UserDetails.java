package com.regularexp;

import java.util.Scanner;

import java.util.regex.Pattern;

public class UserDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The User Name");
        String name = sc.nextLine();
        if(!Pattern.matches("[a-zA-Z\\s]{3,33}", name)) {
        	 System.out.println("Try With Characters Only");
        	return;
        }
       
        System.out.println("Enter Your Email");
        String email = sc.nextLine();
        if(!Pattern.matches("[a-z0-9._%+-]+@(gmail\\.com|co\\.in)", email)) {
        	System.out.println("Not Correct Foramt Suggested format:-"+" testemail123@gmail.com");
        	return;
        }
        System.out.println("Enter Your Mobile Number");
        String Num = sc.nextLine();
        if(!Pattern.matches("[0-9]{10}", Num)) {
        	System.out.println("Enter The 10 Digit Number");
        	return;
        }
        
        
        
        System.out.println(name);
        System.out.println(email);
        System.out.println(Num);
}
}