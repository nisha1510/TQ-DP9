package com.exceptionhandling;

public class FirstExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		try {
			int result = (x+y)/(x-y);
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		int s = (2*x)+(2*y);
		System.out.println(s);

	}

}
