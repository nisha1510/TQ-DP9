package com.assignmentException;
//11. WAP to return int value in try block and return int value 
//in finally block and observe which return takes precedence

public class Q11ReturnIntTryFinally {

	public static int getValue() {
		try
		{
			System.out.println("Inside try block");
			return 10;
		}
		finally 
		{
			System.out.println("Inside finally block");
			return 20;
		}
	}

	public static void main(String[] args) {
	
		int result = getValue();
		System.out.println("Returned value: " + result);
	}

}
