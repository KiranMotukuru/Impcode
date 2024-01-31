package com.Strings;

import java.util.Arrays;

public class Strings {
	public static void main(String[] args) {

		char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'd' };
		String str = "kiranmotukuru";
		String str2 = "kiranMotuKuru";
		String originalSentence = "I have an apple, and she has an apple too.";
		String replacedSentence = originalSentence.replaceAll("apple", "orange").toUpperCase().concat(str2);

		
		
		 char[] name=   str.toCharArray(); 
		   Arrays.sort(name);
	        String alphabeticalOrder = new String(name);
	        
			System.out.println(
					
					alphabeticalOrder
				);



		// Methods
		String subStr = str.substring(5); // Returns "motukuru!"
		String subStr2 = str.substring(0, 5); // Returns "kiran"
		String replacedStr = str.replace('o', '0');
		String upperCase = str.toUpperCase(); // Returns "HELLO"
		
		
		
		int lowerCase = str.toLowerCase().trim().length();// Returns "hello"
		int length = upperCase.trim().length();
		int indexOfWorld = str.indexOf("m");

		boolean isEqual = str.equals(str2);
		boolean isEqualIgnoreCase = str.trim().equalsIgnoreCase(str2);
		boolean startsWithHello = str.startsWith("kiran");
		boolean endsWithWorld = str.endsWith("World!");
		boolean containsWorld = str.contains("m");



	}

}
