package com.assignmentException;

import java.io.IOException;

//checked Exc is not automatically propagate by calling method
public class Q14CheckedPropagation {

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
	
		Q14CheckedPropagation obj = new Q14CheckedPropagation();
		obj.method3();
	}
}
