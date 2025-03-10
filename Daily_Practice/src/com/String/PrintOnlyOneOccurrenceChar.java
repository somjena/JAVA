package com.String;  
public class PrintOnlyOneOccurrenceChar {  
    public static void main(String[] args) {  
        String s = "ramana";  // Input String
        
       
        int[] freq = new int[256];  
       
        for(int i = 0; i < s.length(); i++) {  
            char c = s.charAt(i);  
            freq[c]++;  
        }  
        
     
        for(int i = 0; i < s.length(); i++) {  
            char c = s.charAt(i);  
            if(freq[c] == 1) { 
                System.out.print(c);  
            }  
        }  
    }  
}  
