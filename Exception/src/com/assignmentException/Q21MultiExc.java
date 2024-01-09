package com.assignmentException;

//WAP to catch multiple exceptions. I.e. ArrayIndexOutOfBoundsException and 
//ArithmeticException and NullPointerException.
public class Q21MultiExc {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
	//	int[] numbers = null;
		try 
		{
			// Simulating ArrayIndexOutOfBoundsException
			for (int i = 0; i <= numbers.length; i++)
			{
				try 
				{
					// Simulating ArithmeticException (divide by zero)
					int result = numbers[i] / 0;
					System.out.println("Result: " + result);
				} 
				catch (ArithmeticException e)
				{
					System.out.println("ArithmeticException caught: " + e);
				}
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
		} 
		catch (NullPointerException e)
		{
			System.out.println("NullPointerException caught: " + e);
		}
	}
}
