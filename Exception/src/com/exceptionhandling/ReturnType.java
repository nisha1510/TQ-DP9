package com.exceptionhandling;

public class ReturnType {

	static int method1(int data) {
		try
		{
			return 30/data;
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return 0;// if exception is there
		//if exception is caught it is returned
	}
	
//	static int method2(int data) {
//		try
//		{
//			return 30/data;
//		}
//		catch (Exception e) {
//			System.out.println(e);
//			return 0;
//		}
//		return -1;//if try is returning and catch is also returning
//		//it becomes unreachable
//	}
	
	static int method3(int data) {
		try
		{
			return 30/data;
		}
		catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		finally {//override all return statement
			return 1;
		}
	//	return -1;//unreachable
	}
	public static void main(String[] args) {
		
		System.out.println(method1(0));
		System.out.println(method1(2));
		
		System.out.println("-------------");
		
		System.out.println(method3(0));
		System.out.println(method3(2));
	}

}
