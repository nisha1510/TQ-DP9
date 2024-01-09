package com.assignmentException;
//Unchecked Exc automatically ropagate by calling method
public class Q15UncheckedPropagation {

	void method1() {
		throw new ArithmeticException("Divide by zero");
	}

	void method2() {
		method1();
	}

	void method3() {
		method2();
	}

	public static void main(String[] args) {
	
		Q15UncheckedPropagation obj = new Q15UncheckedPropagation();
		obj.method3();
	}
}
