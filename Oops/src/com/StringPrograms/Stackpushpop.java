package com.StringPrograms;

import java.util.Stack;

public class Stackpushpop {

    public static void main(String[] args) {
        String name = "Soumitra";
        char[] arr = name.toCharArray();
        
        Stack<Character> st = new Stack<>(); 
        
        
        for (char ar : arr) {
            st.push(ar);
        }
        
       
        System.out.print("Reversed string: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}
