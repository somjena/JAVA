package com.OneDArray;

public class SumofeachelementUptoSingleDigit {

    public static void main(String[] args) {
        int[] a = {23, 55, 57, 93, 10, 1};

        for (int i = 0; i < a.length; i++) {
            int n = a[i];

            // Loop until we get a single-digit number
            while (n > 9) {
                int sum = 0;
                while (n != 0) {
                    sum += n % 10; // Add the last digit
                    n /= 10;       // Remove the last digit
                }
                n = sum; // Update n to the computed sum
            }

            a[i] = n; // Update array with the single-digit result
        }

        // Print the updated array
        for (int n : a) {
            System.out.println(n);
        }
    }
}
