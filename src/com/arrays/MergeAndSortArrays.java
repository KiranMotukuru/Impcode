package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		int[] array1 = { 9, 8, 4, 8 };
		int[] array2 = { 8, 1, 7, 8 };

		System.out.println("Array 1 :" + Arrays.toString(array1));
		System.out.println("Array 2 :" + Arrays.toString(array2));
		// Sort the merged array
		int[] mergedArray = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
		Arrays.sort(mergedArray);
		System.out.println(Arrays.toString(mergedArray));
		Set<Integer> setbox = new HashSet<Integer>();
		for (Integer dummy : mergedArray) {
			setbox.add(dummy);
		}

		int[] intbox = new int[setbox.size()];
		int in = 0;

		for (int i : setbox) {
			intbox[in++] = i;
		}
		System.err.println(Arrays.toString(intbox));
	}
}
