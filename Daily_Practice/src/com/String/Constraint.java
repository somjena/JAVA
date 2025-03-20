package com.String;
import java.util.Arrays;

public class Constraint {
    public static void main(String[] args) {
        String s = "success";
        
        char[] ch = s.toCharArray();
        char median = ch[ch.length / 2];
        char[] temp = new char[ch.length];

        int j = 0;
        
        for (int i = ch.length / 2 - 1; i >= 0; i--) {
            temp[j++] = ch[i];
        }
      
        temp[j++] = median;
     
        for (int k = ch.length - 1; k > ch.length / 2; k--) {
            temp[j++] = ch[k];
        }

        
        System.out.println(new String(temp));
    }
}
