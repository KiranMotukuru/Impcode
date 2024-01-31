package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
	        int[] numbers = {5,4,3,2,6};
	      


        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Perform binary search for the value 5 multiple times
        for (int i = 0; i < numbers.length; i++) {
        	Scanner sc = new Scanner(System.in);
        	int SearchtheNumber=sc.nextInt();
            int result = Arrays.binarySearch(numbers, SearchtheNumber);

            // Check if the value is found
            if (result >= 0) {
                System.out.println(  SearchtheNumber + " found at index " + result);
            } else {
                System.out.println( SearchtheNumber +" not found in the array");
            }
        }
    }
}
