package com.assignmentException;

public class Q32ClassNotFoundExc {

	public static void main(String[] args) {
		try 
		{
			// Trying to load a class that doesn't exist
			Class.forName("NonExistentClass");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("ClassNotFoundException caught: " + e);
		}
	}
}
