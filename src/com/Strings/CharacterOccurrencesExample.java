package com.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterOccurrencesExample {

    public static void main(String[] args) {
        String inputString = "aabccd";
        
        System.out.println(inputString);

        // Create a map to store character occurrences
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char key : inputString.toCharArray()) {
            charCountMap.put(key,  charCountMap.getOrDefault(key, 0) + 1);
        }
        
        
      System.out.println(charCountMap);
        

        // Print the character occurrences
		/*
		 * System.out.println("Character Occurrences:"); for (Map.Entry<Character,
		 * Integer> entry : charCountMap.entrySet()) { System.out.println(entry.getKey()
		 * + ": " + entry.getValue() + " times"); }
		 */
    }
}
