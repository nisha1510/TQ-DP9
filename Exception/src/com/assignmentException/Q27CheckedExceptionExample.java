package com.assignmentException;

import java.io.FileWriter;
import java.io.IOException;

//WAP to show checked exception thrown
public class Q27CheckedExceptionExample {
	
	public static void writeToFile(String fileName, String content) throws IOException {
		FileWriter writer = null;
		try 
		{
			writer = new FileWriter(fileName);
			writer.write(content);
		}
		finally
		{
			if (writer != null)
			{
				try 
				{
					writer.close();
				}
				catch (IOException e) 
				{
					System.out.println("Error while closing the file: " + e.getMessage());
				}
			}
		}
	}

	public static void main(String[] args) {
		try 
		{
			writeToFile("example.txt", "Hello, checked exception!");
		}
		catch (IOException e) 
		{
			System.out.println("IOException caught: " + e.getMessage());
			// Handle the exception or perform necessary actions
		}
	}
}
