package com.StreamApi;

import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String s = "Soumitra Jena";

        // Counting occurrences of each character
        Map<Character, Long> m = s.chars()
                .mapToObj(c -> (char) c)  // Convert int to Character
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
                m.forEach((c,i)->System.out.println(c+"="+i));
    }
}
