package com.regularexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter The Number:");
        
        String number = sc.nextLine();
        
       
        Pattern p = Pattern.compile("[0-9]{10}");
        boolean isMatching = p.matcher(number).matches();
        
        if(isMatching) {
            System.out.println("Your Number Verified - +91" + number);
        } else {
            System.out.println("Try Again...");
        }

        
    }
}
