package com.assignmentException;

public class Q17ThrowKeywordExample {

	public static void main(String[] args) {
		int age = 17;
		try {
			if (age < 18) {
				throw new IllegalArgumentException("Age must be 18 or above.");
			} else {
				System.out.println("You are eligible vote");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
