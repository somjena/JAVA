package com.Loops_NumberPrograms;
import java.util.Scanner;

public class PrimeNumberRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Starting Range:");
        int start = sc.nextInt();
        System.out.println("Enter The Ending Range:");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i == 1) {
                continue; 
            }
            boolean isPrime = true; 
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { // If divisible, not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i); // Print the prime number
            }
        }
    }
}
