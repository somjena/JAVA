package com.StringPrograms;

public class BalanceString {

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Is the string balanced? " + isBalanced(input));
    }

    public static boolean isBalanced(String arg) {
        String s = "";
      
        for (int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            if (c == '[' || c == ']' || c == '{' || c == '}' || c == '(' || c == ')') {
                s += c;
            }
        }
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
      
        return s.length() == 0;
    }
}
