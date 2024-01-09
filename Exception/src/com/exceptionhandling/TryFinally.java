package com.exceptionhandling;

public class TryFinally {

	public static void main(String[] args) {
		try {
			int a = 10;
			System.out.println(a/0);
		}
		finally {
			System.out.println("Last code...");
		}
//exception is handled after executing finally block by JVM
//catch : JVM		
	}

}
