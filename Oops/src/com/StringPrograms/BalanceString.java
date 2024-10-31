package com.StringPrograms;

public class BalanceString {

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Is the string balanced? " + isBalanced(input));
    }

    public static boolean isBalanced(String arg) {
        String s = "";
        // Collect only the brackets from the input
        for (int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            if (c == '[' || c == ']' || c == '{' || c == '}' || c == '(' || c == ')') {
                s += c;
            }
        }
        // Remove pairs iteratively
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
        // If all pairs are balanced, s should be empty
        return s.length() == 0;
    }
}
