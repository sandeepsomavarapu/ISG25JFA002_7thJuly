package com.cts.exceptions;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for division");
		int a = scan.nextInt();
		System.out.println("Enter second number for division");
		int b = scan.nextInt();
		try {
			int result = a / b;
			System.out.println("division of two numbers :" + result);
		} catch (ArithmeticException ex) {
			System.out.println("Cannot devide by zero");
		}
		System.out.println("remaining 1000 lines code");

		// user friendly error messages
		// normal termination
		// try -->risky code/ error coce
		// catch -->handling code
		// finally-->cleanup code
		// throw --->to throw explicitly
		// throws -->to intimate caller
	}

}
