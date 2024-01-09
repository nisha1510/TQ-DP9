package com.assignmentException;

import java.util.Scanner;

public class Q18Finally {
	/*
	 * The finally block is used in exception handling along with try and catch. It
	 * is executed regardless of whether an exception is thrown or not. It's
	 * commonly used to perform cleanup operations such as closing resources (file,
	 * database connections) t hat must be executed whether an exception occurs or
	 * not.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			System.out.println("Entered number: " + num);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		} finally {
			scanner.close();
			System.out.println("Finally block executed.");
		}
	}
}
