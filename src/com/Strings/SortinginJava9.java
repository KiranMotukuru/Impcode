package com.Strings;

import java.util.stream.Collectors;

public class SortinginJava9 {

    public static void main(String[] args) {
        String name = "dcbaaaa";

        // Convert the string to a stream of characters
        String result = name.chars()
                // Convert each character to a string
                .mapToObj(c -> String.valueOf((char) c))
                // Use distinct to eliminate duplicates
                .distinct()
                // Sort the characters in alphabetical order
                .sorted()
                // Collect the characters into a single string
                .collect(Collectors.joining());

        System.out.println("Original Name: " + name);
        System.out.println("Alphabetical Order with Duplicates Removed: " + result);
    }
}
