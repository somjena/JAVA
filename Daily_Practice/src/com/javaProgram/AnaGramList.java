package com.javaProgram;

import java.util.*;

public class AnaGramList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "race", "care", "bare", "bear", "bar");

        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        

        for (String word : list) {
            char[] chars = word.toCharArray();
            
            Arrays.sort(chars);
            String sortedWord = new String(chars);

     
            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Grouped Anagrams:");
        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
           
        }
       
        
    }
}
