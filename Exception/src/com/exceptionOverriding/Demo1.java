package com.exceptionOverriding;

class Parent {
	int data = 50;

	// not throwing any exception
	void printData() {
		System.out.println(data);
	}

	void printData2() throws ArithmeticException {
		System.out.println(data / 0);
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

	// can throw only unchecked exception of same or other
	void printData2() throws ArithmeticException, ArrayIndexOutOfBoundsException // ,IOException
	{
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

		// throw new IOException();
	}

}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
