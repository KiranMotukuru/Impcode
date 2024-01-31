package com.Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SortingAndDeleting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String name = sc.next();

		// Convert the string to a char array
		char[] charArray = name.toCharArray();

		// Sort the char array in alphabetical order
		Arrays.sort(charArray);

		// Create a LinkedHashSet to eliminate duplicates while preserving order

		// empty
		Set<Character> uniqueSet = new LinkedHashSet<>();

		for (char ref : charArray) {
			uniqueSet.add(ref);
		}

		// Convert the set back to a char array
		char[] uniqueChars = new char[uniqueSet.size()];
		int index = 0;
		for (char cref : uniqueSet) {
			uniqueChars[index++] = cref;
		}

		// Convert the unique char array back to a string
		String result = new String(uniqueChars);

		System.out.println("Original Name: " + name);
		System.err.println("Alphabetical Order with Duplicates Removed: " + result);
	}
}
