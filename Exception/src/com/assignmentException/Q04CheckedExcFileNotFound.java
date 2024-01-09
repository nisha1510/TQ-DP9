package com.assignmentException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//WAP to show checked exception and use multiple catch block with universal Exception handler.
public class Q04CheckedExcFileNotFound {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream file = null;
		try 
		{
			file = new FileInputStream("C:\\Users\\Hp\\Desktop\\TQ DP9 Fighters\\Nov2");
		}
		catch (FileNotFoundException e) 
		{
			System.out.println(e+" File does not exist");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
