package com.String;

public class MinimumOccurrence {
    public static void main(String[] args) {
        String s = "Ramana";
        int freq[] = new int[256]; 

        // Convert to lowercase to make it case-insensitive (optional)
        s = s.toLowerCase();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        // Find the minimum occurring character
        int minCount = Integer.MAX_VALUE;
        char minChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && freq[i] < minCount) {
                minCount = freq[i];
                minChar = (char) i;
            }
        }

        // Output result
        System.out.println("Character with minimum occurrence: " + minChar + " = " + minCount);
    }
}
