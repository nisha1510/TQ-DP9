package com.assignmentException;
//WAP to check Exception handling with method overriding. Means, If super class method don’t 
//declare exception then subclass overridden method can declare exception or not. 

class Parent {
	int data = 50;

	// not throwing any exception
	void printData() {
		System.out.println(data);
	}
}

class Child extends Parent {

	int val = 0;

	// can throw only unchecked exception
	void printData() throws ArithmeticException // ,IOException
	{
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

		// throw new IOException();
	}
}
	
public class Q16Overriding {

}
