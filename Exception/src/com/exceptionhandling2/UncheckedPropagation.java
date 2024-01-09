package com.exceptionhandling2;
//Unchecked Exc automatically ropagate by calling method
public class UncheckedPropagation {

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
	
		UncheckedPropagation obj = new UncheckedPropagation();
		obj.method3();
	}
}
