package com.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String name = "kiran";
		
		
		Map<Character, Integer> ma = new HashMap<Character, Integer>();
		for (char dummy : name.toCharArray()) {
			ma.put(dummy, ma.getOrDefault(dummy, 0)+1);
		}
		
		System.err.println(ma);
	   char[] charArray = name.toCharArray();
		Arrays.sort(charArray);
		// aabcd

		Set<Character> set = new HashSet();

		for (char dummy : charArray) {
			set.add(dummy);
		}

		char[] last = new char[set.size()];
               int i = 0;

		for (char c : set) {
			last[i++] = c;
		}

		String n = new String(last);
		System.out.println(n);
		
	//	 int num=  Integer.parseInt(n);
///		System.out.println(num+1);

	}

}
