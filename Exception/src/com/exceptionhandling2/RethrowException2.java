package com.exceptionhandling2;

public class RethrowException2 {
	
	static void method1() {
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("In catch block of method 1");
			throw e;//rethrowing - handled by JVM
		}
	}
	public static void main(String[] args) {
		
//		try {
//			method1();
//		}catch(Exception ex) {
//			System.out.println("In main : "+ex);//handled by main
//		}
		
		try {
			method1();
		}catch(Exception ex) {
			System.out.println("In main : "+ex);//handled by main
			throw ex;//it again throw & then handled by jvm
		}
	}
}
