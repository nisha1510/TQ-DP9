package com.assignmentException;

import java.util.Scanner;

//WAP to show the difference between final, finally, finalize
public class Q18FinalFinallyFinalize {
	/*
	 * The final keyword is used to apply restrictions on classes, methods, and
	 * variables. When applied:
	 * For classes, it makes the class immutable and cannot be subclassed. For
	 * methods, it prevents method overriding in subclasses. For variables, it
	 * creates constants; the value of a final variable cannot be changed once
	 * initialized.
	 */

	public static void main(String[] args) {
		final int x = 10; 
		// x = 20; // This will cause a compilation error since x is final and its value
		// cannot be changed
		System.out.println("Value of x: " + x);
	}
}
