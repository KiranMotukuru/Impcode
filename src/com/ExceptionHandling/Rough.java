
package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class CustomException extends Throwable {
	public CustomException(String message) {
		super(message);
	}
}

class CustomDivideByZeroException extends CustomException {
	public CustomDivideByZeroException(String message) {
		super(message);
	}
}

public class Rough {

	public static void main(String[] args) throws CustomException, InputMismatchException , ArithmeticException,IllegalAccessException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A");
			int a = sc.nextInt();
			System.out.println("Enter B");
			int b = sc.nextInt();

			System.out.println(divide(a, b));
		} catch (CustomException | InputMismatchException e) {
		e.printStackTrace();
			System.out.println("Please check the Number or Don't Give Zero");
		} catch (Exception e) {
			System.out.println("Something happened, please check");
		} finally {
			System.out.println("Program Closed");
		}
	}

	public static int divide(int a, int b) throws CustomException {
		if (b == 0) {
			throw new CustomDivideByZeroException("Cannot divide by zero");
		}
		return a / b;
	}
}
