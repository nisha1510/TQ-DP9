package com.exceptionhandling2;

import java.io.IOException;

public class ThrowsDemo2 {
	
	static void method1() {
		
			String s = null;
			System.out.println(s.length());
			try {
				throw new IOException("No input..method1");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	
	static void method2() throws IOException, NullPointerException {
		
		String s = null;
		System.out.println(s.length());
		
			throw new IOException("No input..method12");
	}

	public static void main(String[] args)  {
		
		method1();
		try {
			method2();
		} catch (NullPointerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
