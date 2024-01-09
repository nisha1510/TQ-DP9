package com.assignmentException;

public class Q20GenerateError {
	
	public static void generateStackOverflowError() {
		// Recursive method that causes a StackOverflowError
		generateStackOverflowError();
	}
	public static void main(String[] args) {
		generateStackOverflowError();
	}
}
