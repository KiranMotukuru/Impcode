package com.Strings;
import java.util.*;

public class SortingAndDeletingUsingMap {

    public static void main(String[] args) {
        String name = "dcbaa";

        // Convert the string to a char array
        char[] charArray = name.toCharArray();

        // Create a map to store character occurrences
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char dummyref : charArray) {
            charCountMap.put(dummyref, charCountMap.getOrDefault(dummyref, 0) + 1);
        }

        // Sort the char array in alphabetical order
        Arrays.sort(charArray);

        // Create a LinkedHashSet to eliminate duplicates while preserving order
        Set<Character> uniqueSet = new LinkedHashSet<>();
        for (char c : charArray) {
            uniqueSet.add(c);
        }

        // Convert the set back to a char array
        char[] uniqueChars = new char[uniqueSet.size()];
        int index = 0;
        for (char c : uniqueSet) {
            uniqueChars[index++] = c;
        }

        // Convert the unique char array back to a string
        String result = new String(uniqueChars);

        System.out.println("Original Name: " + name);

        // Print character occurrences
        System.out.println("Character Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
        System.err.println("Alphabetical Order with Duplicates Removed: " + result);
    }
}
