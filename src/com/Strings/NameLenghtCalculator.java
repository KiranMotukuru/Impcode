package com.Strings;

import java.util.Scanner;

public class NameLenghtCalculator {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter name only with  '5'  Charcters");
		String string = sc.next();
		
	
		
		if(string.length()<=5) {
			System.out.println("Your Name    " + string+      "   is Elgible ");
			
		}
		else {
			
			System.out.println("As  I said , enter only 5 Characters");
		}
		
	}
}
