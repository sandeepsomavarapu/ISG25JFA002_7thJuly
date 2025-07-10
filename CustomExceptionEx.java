package com.cts.exceptions;

import java.util.Scanner;

class AgeNotValidException extends Exception {
	public AgeNotValidException(String message) {
		super(message);
	}
}

public class CustomExceptionEx {

	public static void main(String[] args) throws AgeNotValidException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = scan.nextInt();
		if (age < 18)
			throw new AgeNotValidException("You are not to caste vote...");
		else
			System.out.println("You are allowed to caste  vote");

	}

}
//username
//password

//cognizant  cognizant@123

//login success

//throw InvalidCredentialsException






