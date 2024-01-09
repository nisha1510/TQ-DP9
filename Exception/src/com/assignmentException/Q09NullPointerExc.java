package com.assignmentException;

public class Q09NullPointerExc {

	public static void main(String[] args) {
		// Scenario 1: Accessing a method or property of a null object
		try {
			String str = null;
			int length = str.length(); // Trying to get the length of a null string
			System.out.println("Length of string: " + length);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred: " + e.getMessage());
		}

		// Scenario 2: Accessing an array reference which is null
		try {
			int[] numbers = null;
			int value = numbers[0]; // Trying to access an element of a null array
			System.out.println("Value at index 0: " + value);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred: " + e.getMessage());
		}

		// Scenario 3: Calling a method on a null object reference
		try {
			String text = null;
			boolean isEmpty = text.isEmpty(); // Trying to call a method on a null string reference
			System.out.println("Is string empty? " + isEmpty);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred: " + e.getMessage());
		}
	}
}
