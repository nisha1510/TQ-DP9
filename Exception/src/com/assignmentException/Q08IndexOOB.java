package com.assignmentException;

//WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
//StringIndexOutOfBound) exception is generated and handle this exception
public class Q08IndexOOB {

	public static void main(String[] args) {
	
		try 
		{
			int[] numbers = { 1, 2, 3, 4, 5 };
			int index = 10; 
			int value = numbers[index];
			System.out.println("Value at index " + index + ": " + value);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
		}

		try 
		{
			String text = "Hello";
			char ch = text.charAt(10); // Trying to access a character beyond the string's length
			System.out.println("Character at index 10: " + ch);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
		}
	}
}
