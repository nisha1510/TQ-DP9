package com.exceptionOverriding;

import java.io.IOException;


class Parent1 {

	int data = 50;

	// throws checked exception
	void printData() throws IOException {
		System.out.println(data);
		throw new IOException("Input error...");
	}

	// throws checked exception
	void printData2() throws Exception {
		System.out.println(data);
		throw new Exception("Input error...");
	}

}

class Child1 extends Parent1 {

	int val = 10;

	// throw any unchecked , checked :same or its child
	void printData() throws ArithmeticException, IOException//,Exception 
	{
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

		// throw new IOException();
	}
	

	// throw any unchecked , checked :same or its child
	void printData2() throws ArithmeticException, IOException {
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

		// throw new IOException();
	}

}


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
