package com.regularexp;

import java.util.regex.Pattern;

public class UsernameValidator {

    // Define the regex pattern for a valid username
    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,19}$";
    
    // Compile the pattern
    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);
    
    // Method to validate the username
    public static boolean isValidUsername(String username) {
        return pattern.matcher(username).matches();
    }

    public static void main(String[] args) {
        // Test cases
        String[] usernames = {"user1", "john_doe", "1username", "user", "very_long_username_exceeding_20"};

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username + " is a valid username.");
            } else {
                System.out.println(username + " is not a valid username.");
            }
        }
    }
}
