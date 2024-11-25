package com.OneDArray;
//Q.26
public class RemoveTheDuplicateElement {

	public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 2, 4};

        // Call the method to remove duplicates
        int[] result = removeDuplicates(a);

        // Print the result
        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        // Create a new array to hold unique elements
        int[] temp = new int[array.length];
        int uniqueCount = 0;

        // Iterate through the original array
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the element is already in the temp array
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Create a new array of the exact size of unique elements
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}