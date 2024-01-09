package com.assignmentException;

import java.util.Scanner;

class InvalidNameException extends RuntimeException{

	public InvalidNameException() {
		super();
	}
	
	public InvalidNameException(String msg) {
		super(msg);
	}
}

public class Q22UserDefinedExc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = sc.next();

		try {
			if (name.length() < 3)
				throw new InvalidNameException("Name must be greater than two characters");

			System.out.println("Welcome " + name);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
