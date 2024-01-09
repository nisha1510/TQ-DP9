package com.exceptionhandling2;

import java.util.Scanner;

public class ThrowDemo4 {

	static Scanner sc = new Scanner(System.in);
	
	static void enterDetails() {
		
		System.out.println("Enter name ");
		String name = sc.next();
		
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		try {	
			if(marks<0 || marks>100) 
				throw new RuntimeException("Marks should be between 0 & 100");
		
				if(marks>40)
					System.out.println(name+" has cleared the exam");
				else
					System.out.println(name+" has not cleared the exam");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	
	
	public static void main(String[] args) {
		enterDetails();
	}
}
