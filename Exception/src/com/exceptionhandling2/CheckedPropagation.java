package com.exceptionhandling2;

import java.io.IOException;

//checked Exc is not automatically ropagate by calling method
public class CheckedPropagation {

	void method1() throws IOException{
		throw new ArithmeticException("Divide by zero");
	}

	void method2() throws IOException{
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
	
		CheckedPropagation obj = new CheckedPropagation();
		obj.method3();
	}
}
