package com.exceptionhandling2;

public class RethrowException {
	
	static void method1() {
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("In catch block of method 1");
			throw e;//rethrowing
		}
	}
	public static void main(String[] args) {
		
		method1();
	}

}
