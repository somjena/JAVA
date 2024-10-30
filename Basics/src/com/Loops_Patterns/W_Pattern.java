package com.Loops_Patterns;

public class W_Pattern {

    public static void main(String[] args) {
        int height = 5;  

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
                
                if (j == 0 || j == height * 2 - 2 || (i == j && i >= height / 2) || (i + j == height * 2 - 2 && i >= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
