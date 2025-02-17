package com.javaProgram;

import java.util.Arrays;

public class ZerotoEnd {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));
        moveZeroesToEnd(arr);
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }

    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroIndex = 0; // Pointer for non-zero elements

        // First pass: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Second pass: Fill the remaining spaces with zeroes
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}
