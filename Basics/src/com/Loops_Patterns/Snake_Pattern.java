package com.Loops_Patterns;

public class Snake_Pattern {

    public static void main(String[] args) {
        int rows = 5;  
        int cols = 10; 

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                
                for (int j = 0; j < cols; j++) {
                    System.out.print("*");
                }
            } else {
                
                for (int j = 0; j < cols; j++) {
                    if (j == cols - 1) {
                        System.out.print("*"); 
                    } else {
                        System.out.print(" "); 
                    }
                }
            }
            System.out.println(); 
        }
    }
}
